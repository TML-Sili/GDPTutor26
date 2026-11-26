package sichtbarkeit2.y;

import sichtbarkeit2.x.XMain;

// public: wird aus XMain im Paket sichtbarkeit2.x verwendet.
public class YClient {

    // private: wird nur innerhalb von YClient (aus antwort) aufgerufen.
    private static void intern() {
        System.out.println("intern");
    }

    // public: wird aus XMain (anderes Paket) aufgerufen.
    public static void antwort() {
        intern();
        XMain.start();
    }
}
