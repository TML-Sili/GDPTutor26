package fehlersuche.p2;

// Fehlerart: Kompilierfehler.
// Erklärung: Eine abstrakte Klasse kann nicht direkt mit new instanziiert werden.
// Korrektur: Eine konkrete Unterklasse definieren und diese instanziieren (alternativ: abstract entfernen).
abstract class Fahrzeug {

    void starten() {
        System.out.println("Fahrzeug startet");
    }
}

class Auto extends Fahrzeug {
}

public class Main {
    public static void main(String[] args) {
        Fahrzeug f = new Auto();
        f.starten();
    }
}
