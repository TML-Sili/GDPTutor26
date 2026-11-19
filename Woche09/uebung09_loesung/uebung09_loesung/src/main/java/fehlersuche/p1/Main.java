package fehlersuche.p1;

// Fehlerart: Kompilierfehler.
// Erklärung: Der statische Typ von t war Tier, daher war bellen() für den Compiler nicht sichtbar.
// Korrektur: Variable t als Hund deklarieren (alternativ: instanceof-Prüfung und Cast auf Hund).
class Tier {
    void schlafen() {
        System.out.println("Schlafen");
    }
}

class Hund extends Tier {
    void bellen() {
        System.out.println("Wuff");
    }
}

public class Main {
    public static void main(String[] args) {
        Hund t = new Hund();

        t.schlafen();
        t.bellen();
    }
}
