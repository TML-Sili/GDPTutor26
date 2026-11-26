package sichtbarkeit3.basis;

public class Basis {

    public int geheim = 1;
    public int vererbt = 2;
    public int paketWert = 3;

    public Basis() {
    }

    public void info() {
        System.out.println("geheim = " + geheim);
    }

    public void externAufruf() {
        Nachbar.zeige(this);
        info();
    }
}
