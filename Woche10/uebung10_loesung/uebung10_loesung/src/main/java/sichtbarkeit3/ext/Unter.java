package sichtbarkeit3.ext;

import sichtbarkeit3.basis.Basis;

// package-private: wird nur aus ExtApp im selben Paket sichtbarkeit3.ext verwendet.
class Unter extends Basis {

    // package-private: wird nur aus ExtApp im selben Paket aufgerufen.
    Unter() {
        super();
    }

    // private: wird nur innerhalb von Unter (aus zeigeAlles) aufgerufen.
    private void intern() {
        System.out.println("intern");
    }

    // package-private: wird nur aus ExtApp im selben Paket aufgerufen.
    void zeigeAlles() {
        System.out.println("vererbt = " + vererbt);
        info();
        intern();
    }
}
