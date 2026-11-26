package fehlersuche.p1.app;

import fehlersuche.p1.modell.Konto;

public class Main {
    public static void main(String[] args) {
        Konto k = new Konto(150.0);
        System.out.println("Saldo: " + k.getSaldo());
    }
}
