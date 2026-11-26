package sichtbarkeit2.x;

// package-private: wird nur aus XMain im selben Paket sichtbarkeit2.x verwendet.
class XHelper {

    // package-private: wird aus XMain im selben Paket gelesen.
    static int wert = 42;

    // private: wird nur innerhalb von XHelper (aus drucke) aufgerufen.
    private static void hilfe() {
        System.out.println("hilfe");
    }

    // package-private: wird nur aus XMain im selben Paket aufgerufen.
    static void drucke() {
        hilfe();
        System.out.println("wert = " + wert);
    }
}
