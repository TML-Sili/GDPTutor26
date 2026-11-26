package sichtbarkeit;

import org.junit.Test;
import sichtbarkeit.a.A1;
import sichtbarkeit.a.A2;
import sichtbarkeit.b.B1;
import java.lang.reflect.Modifier;
import static org.junit.Assert.*;

public class SichtbarkeitTests {

    private boolean isPackagePrivate(int mods) {
        return !Modifier.isPublic(mods) && !Modifier.isProtected(mods) && !Modifier.isPrivate(mods);
    }

    @Test
    public void testKlassenSichtbarkeit() {
        assertTrue("A1 muss public sein", Modifier.isPublic(A1.class.getModifiers()));
        assertTrue("A2 muss public sein", Modifier.isPublic(A2.class.getModifiers()));
        assertTrue("B1 muss public sein", Modifier.isPublic(B1.class.getModifiers()));
    }

    @Test
    public void testMethodenSichtbarkeitA1() throws Exception {
        int a11 = A1.class.getDeclaredMethod("a11").getModifiers();
        int a12 = A1.class.getDeclaredMethod("a12").getModifiers();
        assertTrue("A1.a11 muss protected sein", Modifier.isProtected(a11));
        assertTrue("A1.a12 muss private sein", Modifier.isPrivate(a12));
    }

    @Test
    public void testMethodenSichtbarkeitA2() throws Exception {
        int a21 = A2.class.getDeclaredMethod("a21").getModifiers();
        int a22 = A2.class.getDeclaredMethod("a22").getModifiers();
        assertTrue("A2.a21 muss package-private (ohne Modifikator) sein", isPackagePrivate(a21));
        assertTrue("A2.a22 muss public sein", Modifier.isPublic(a22));
    }

    @Test
    public void testMethodenSichtbarkeitB1() throws Exception {
        int b11 = B1.class.getDeclaredMethod("b11").getModifiers();
        int b12 = B1.class.getDeclaredMethod("b12").getModifiers();
        assertTrue("B1.b11 muss private sein", Modifier.isPrivate(b11));
        assertTrue("B1.b12 muss public sein", Modifier.isPublic(b12));
    }
}
