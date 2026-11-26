package fehlersuche.p2.sub;


import fehlersuche.p2.basis.Geraet;

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
