package sichtbarkeit2;

// Entfernen Sie /* und */, sobald Sie die Sichtbarkeitsattribute in XHelper, XMain und YClient gesetzt haben.
/*
import org.junit.Test;
import java.lang.reflect.Modifier;
import static org.junit.Assert.*;

public class Sichtbarkeit2Tests {

    private boolean isPackagePrivate(int mods) {
        return !Modifier.isPublic(mods) && !Modifier.isProtected(mods) && !Modifier.isPrivate(mods);
    }

    @Test
    public void testXHelper() throws Exception {
        Class<?> xHelper = Class.forName("sichtbarkeit2.x.XHelper");
        assertTrue("XHelper muss package-private sein", isPackagePrivate(xHelper.getModifiers()));
        assertTrue("XHelper.wert muss package-private sein",
            isPackagePrivate(xHelper.getDeclaredField("wert").getModifiers()));
        assertTrue("XHelper.hilfe muss private sein",
            Modifier.isPrivate(xHelper.getDeclaredMethod("hilfe").getModifiers()));
        assertTrue("XHelper.drucke muss package-private sein",
            isPackagePrivate(xHelper.getDeclaredMethod("drucke").getModifiers()));
    }

    @Test
    public void testXMainUndYClient() throws Exception {
        Class<?> xMain = Class.forName("sichtbarkeit2.x.XMain");
        Class<?> yClient = Class.forName("sichtbarkeit2.y.YClient");
        assertTrue("XMain muss public sein", Modifier.isPublic(xMain.getModifiers()));
        assertTrue("XMain.start muss public sein",
            Modifier.isPublic(xMain.getDeclaredMethod("start").getModifiers()));
        assertTrue("YClient muss public sein", Modifier.isPublic(yClient.getModifiers()));
        assertTrue("YClient.intern muss private sein",
            Modifier.isPrivate(yClient.getDeclaredMethod("intern").getModifiers()));
        assertTrue("YClient.antwort muss public sein",
            Modifier.isPublic(yClient.getDeclaredMethod("antwort").getModifiers()));
    }
}
*/
