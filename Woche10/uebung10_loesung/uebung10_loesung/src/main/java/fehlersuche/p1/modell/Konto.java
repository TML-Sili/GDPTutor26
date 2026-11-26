package fehlersuche.p1.modell;

// Korrektur: Klasse als public deklarieren, damit sie aus dem Paket fehlersuche.p1.app sichtbar ist.
public class Konto {
    private double saldo;

    public Konto(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
