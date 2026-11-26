package sichtbarkeit3.ext;

import sichtbarkeit3.basis.Basis;

public class Unter extends Basis {

    public Unter() {
        super();
    }

    public void intern() {
        System.out.println("intern");
    }

    public void zeigeAlles() {
        System.out.println("vererbt = " + vererbt);
        info();
        intern();
    }
}
