package fehlersuche.p2.sub;

import fehlersuche.p2.basis.Geraet;

// Korrektur: Beim Überschreiben darf die Sichtbarkeit nicht eingeschränkt werden (public beibehalten).
public class Drucker extends Geraet {
    @Override
    public void starten() {
        System.out.println("Drucker startet");
    }

    public static void main(String[] args) {
        Geraet g = new Drucker();
        g.starten();
    }
}
