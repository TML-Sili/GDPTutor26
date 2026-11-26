package sichtbarkeit2.y;

import sichtbarkeit2.x.XMain;

public class YClient {

    public static void intern() {
        System.out.println("intern");
    }

    public static void antwort() {
        intern();
        XMain.start();
    }
}
