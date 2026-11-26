package bank;

import bank.modell.Bankkonto;
import bank.modell.ZinsService;
import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import static org.junit.Assert.*;

public class BankTests {

    @Test
    public void testEinzahlenUndAbheben() {
        Bankkonto k = new Bankkonto("Anna", 500.0, 1234);
        assertEquals("Anna", k.getInhaber());
        assertEquals(500.0, k.getKontostand(), 1e-6);

        assertTrue(k.einzahlen(100.0));
        assertEquals(600.0, k.getKontostand(), 1e-6);
        assertFalse(k.einzahlen(-50.0));
        assertFalse(k.einzahlen(0.0));
        assertEquals(600.0, k.getKontostand(), 1e-6);

        assertFalse("Falsche PIN darf nicht abheben", k.abheben(50.0, 9999));
        assertFalse("Überziehung darf nicht erlaubt sein", k.abheben(700.0, 1234));
        assertFalse("Negativer Betrag darf nicht abgehoben werden", k.abheben(-10.0, 1234));
        assertTrue(k.abheben(200.0, 1234));
        assertEquals(400.0, k.getKontostand(), 1e-6);
    }

    @Test
    public void testNegativesStartguthaben() {
        Bankkonto k = new Bankkonto("Beat", -100.0, 4321);
        assertEquals(0.0, k.getKontostand(), 1e-6);
    }

    @Test
    public void testZinsService() {
        Bankkonto k = new Bankkonto("Clara", 1000.0, 1111);
        ZinsService.verzinsen(k, 2.5);
        assertEquals(1025.0, k.getKontostand(), 1e-6);
        ZinsService.verzinsen(k, -5.0);
        assertEquals(1025.0, k.getKontostand(), 1e-6);
    }

    @Test
    public void testInformationHidingUndPaketSichtbarkeit() throws Exception {
        for (Field f : Bankkonto.class.getDeclaredFields()) {
            assertTrue("Feld " + f.getName() + " muss private sein", Modifier.isPrivate(f.getModifiers()));
        }

        Method zins = Bankkonto.class.getDeclaredMethod("gutschriftZins", double.class);
        int mods = zins.getModifiers();
        assertFalse("gutschriftZins darf nicht public sein", Modifier.isPublic(mods));
        assertFalse("gutschriftZins darf nicht protected sein", Modifier.isProtected(mods));
        assertFalse("gutschriftZins darf nicht private sein", Modifier.isPrivate(mods));

        try {
            Bankkonto.class.getDeclaredMethod("getPin");
            fail("Bankkonto darf keine getPin()-Methode anbieten");
        } catch (NoSuchMethodException expected) {
            // gewünscht
        }
    }
}
