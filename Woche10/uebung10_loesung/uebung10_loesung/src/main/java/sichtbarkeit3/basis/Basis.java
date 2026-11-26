package sichtbarkeit3.basis;

// public: wird von Unter und ExtApp im Paket sichtbarkeit3.ext verwendet.
public class Basis {

    // private: wird nur innerhalb von Basis gelesen.
    private int geheim = 1;
    // protected: wird von Unterklasse Unter im anderen Paket gelesen.
    protected int vererbt = 2;
    // package-private: wird nur von Nachbar im selben Paket gelesen.
    int paketWert = 3;

    // protected: Aufruf aus Nachbar (selbes Paket) und aus Unterklasse Unter (super() im anderen Paket).
    protected Basis() {
    }

    // protected: Aufruf aus Unterklasse Unter im anderen Paket.
    protected void info() {
        System.out.println("geheim = " + geheim);
    }

    // public: Aufruf aus ExtApp im anderen Paket (keine Unterklasse von Basis).
    public void externAufruf() {
        Nachbar.zeige(this);
        info();
    }
}
