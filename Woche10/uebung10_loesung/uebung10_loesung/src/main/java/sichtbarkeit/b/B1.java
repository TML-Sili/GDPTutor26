package sichtbarkeit.b;

import sichtbarkeit.a.A1;
import sichtbarkeit.a.A2;

// public: A2 im Paket sichtbarkeit.a ruft B1.b12() auf.
public class B1 extends A1 {

    // private: wird nur innerhalb von B1 aufgerufen.
    private static void b11() {
        System.out.println("b11");
        A1.a11();
    }

    // public: wird aus A2 im anderen Paket sichtbarkeit.a aufgerufen.
    public static void b12() {
        System.out.println("b12");
        A2.a22();
        B1.b11();
    }
}
