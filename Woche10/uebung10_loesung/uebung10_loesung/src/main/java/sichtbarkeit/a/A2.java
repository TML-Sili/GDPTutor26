package sichtbarkeit.a;

import sichtbarkeit.b.B1;

// public: B1 im Paket sichtbarkeit.b ruft A2.a22() auf.
public class A2 {

    // package-private (kein Modifikator): wird nur aus A1 im selben Paket aufgerufen.
    static void a21() {
        System.out.println("a21");
        A1.a11();
    }

    // public: wird aus B1 (anderes Paket, keine Unterklasse von A2) aufgerufen.
    public static void a22() {
        System.out.println("a22");
        B1.b12();
    }
}
