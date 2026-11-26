package sichtbarkeit2.x;

public class XHelper {

    public static int wert = 42;

    public static void hilfe() {
        System.out.println("hilfe");
    }

    public static void drucke() {
        hilfe();
        System.out.println("wert = " + wert);
    }
}
