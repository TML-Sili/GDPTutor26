package bank.modell;

public class Bankkonto {
    private final String inhaber;
    private double kontostand;
    private int pin;

    public Bankkonto(String inhaber, double startguthaben, int pin) {
        this.inhaber = inhaber;
        this.kontostand = startguthaben < 0 ? 0.0 : startguthaben;
        this.pin = pin;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public boolean einzahlen(double betrag) {
        if (betrag <= 0) {
            return false;
        }
        kontostand += betrag;
        return true;
    }

    public boolean abheben(double betrag, int eingegebenePin) {
        if (eingegebenePin != this.pin || betrag <= 0 || betrag > this.kontostand) {
            return false;
        }
        kontostand -= betrag;
        return true;
    }

    // Paketintern (package-private): nur Klassen im Paket bank.modell (z. B. ZinsService) dürfen Zinsen gutschreiben.
    void gutschriftZins(double prozent) {
        if (prozent > 0) {
            kontostand += kontostand * prozent / 100.0;
        }
    }
}
