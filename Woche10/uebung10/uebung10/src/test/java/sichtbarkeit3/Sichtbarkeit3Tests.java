package sichtbarkeit3;

// Entfernen Sie /* und */, sobald Sie die Sichtbarkeitsattribute in Basis, Nachbar und Unter gesetzt haben.
/*
import org.junit.Test;
import java.lang.reflect.Modifier;
import static org.junit.Assert.*;

public class Sichtbarkeit3Tests {

    private boolean isPackagePrivate(int mods) {
        return !Modifier.isPublic(mods) && !Modifier.isProtected(mods) && !Modifier.isPrivate(mods);
    }

    @Test
    public void testBasis() throws Exception {
        Class<?> basis = Class.forName("sichtbarkeit3.basis.Basis");
        assertTrue("Basis muss public sein", Modifier.isPublic(basis.getModifiers()));
        assertTrue("Basis.geheim muss private sein",
            Modifier.isPrivate(basis.getDeclaredField("geheim").getModifiers()));
        assertTrue("Basis.vererbt muss protected sein",
            Modifier.isProtected(basis.getDeclaredField("vererbt").getModifiers()));
        assertTrue("Basis.paketWert muss package-private sein",
            isPackagePrivate(basis.getDeclaredField("paketWert").getModifiers()));
        assertTrue("Konstruktor Basis() muss protected sein",
            Modifier.isProtected(basis.getDeclaredConstructor().getModifiers()));
        assertTrue("Basis.info muss protected sein",
            Modifier.isProtected(basis.getDeclaredMethod("info").getModifiers()));
        assertTrue("Basis.externAufruf muss public sein",
            Modifier.isPublic(basis.getDeclaredMethod("externAufruf").getModifiers()));
    }

    @Test
    public void testNachbarUndUnter() throws Exception {
        Class<?> basis = Class.forName("sichtbarkeit3.basis.Basis");
        Class<?> nachbar = Class.forName("sichtbarkeit3.basis.Nachbar");
        Class<?> unter = Class.forName("sichtbarkeit3.ext.Unter");

        assertTrue("Nachbar muss package-private sein", isPackagePrivate(nachbar.getModifiers()));
        assertTrue("Nachbar.zeige muss package-private sein",
            isPackagePrivate(nachbar.getDeclaredMethod("zeige", basis).getModifiers()));

        assertTrue("Unter muss package-private sein", isPackagePrivate(unter.getModifiers()));
        assertTrue("Konstruktor Unter() muss package-private sein",
            isPackagePrivate(unter.getDeclaredConstructor().getModifiers()));
        assertTrue("Unter.intern muss private sein",
            Modifier.isPrivate(unter.getDeclaredMethod("intern").getModifiers()));
        assertTrue("Unter.zeigeAlles muss package-private sein",
            isPackagePrivate(unter.getDeclaredMethod("zeigeAlles").getModifiers()));
    }
}
*/
