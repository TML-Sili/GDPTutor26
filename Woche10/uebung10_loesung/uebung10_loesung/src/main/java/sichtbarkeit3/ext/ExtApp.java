package sichtbarkeit3.ext;

import sichtbarkeit3.basis.Basis;

// ExtApp und main bleiben public als Programm-Einstiegspunkt.
public class ExtApp {

    public static void main(String[] args) {
        Unter u = new Unter();
        u.zeigeAlles();
        Basis b = u;
        b.externAufruf();
    }
}
