package bibliothek;

public class Main {
    public static void main(String[] args) {
        Medium b1 = new Buch("Clean Code", 2008, "Robert C. Martin");
        Medium b2 = new Buch("Clean Code", 2008, "Robert C. Martin");
        Medium h1 = new Hoerbuch("Der Hobbit", 2012, 660);

        b1.ausleihen();

        System.out.println("b1 ausgeliehen: " + b1.istAusgeliehen());
        System.out.println("h1 ausgeliehen: " + h1.istAusgeliehen());
        System.out.println("b1.equals(b2): " + b1.equals(b2));
        System.out.println("b1.equals(h1): " + b1.equals(h1));

        Medium[] medien = { b1, h1 };
        for (Medium m : medien) {
            System.out.println(m.getBeschreibung());
        }
    }
}
