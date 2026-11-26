package sichtbarkeit2.x;

import sichtbarkeit2.y.YClient;

public class XMain {

    public static void start() {
        XHelper.drucke();
        System.out.println(XHelper.wert);
        YClient.antwort();
    }
}
