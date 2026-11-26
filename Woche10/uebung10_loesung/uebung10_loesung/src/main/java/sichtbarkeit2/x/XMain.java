package sichtbarkeit2.x;

import sichtbarkeit2.y.YClient;

// public: wird aus YClient im Paket sichtbarkeit2.y verwendet.
public class XMain {

    // public: wird aus YClient (anderes Paket) aufgerufen.
    public static void start() {
        XHelper.drucke();
        System.out.println(XHelper.wert);
        YClient.antwort();
    }
}
