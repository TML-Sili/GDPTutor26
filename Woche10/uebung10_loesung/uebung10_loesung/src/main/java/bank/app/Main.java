package bank.app;

import bank.modell.Bankkonto;
import bank.modell.ZinsService;

public class Main {
    public static void main(String[] args) {
        Bankkonto konto = new Bankkonto("Anna Muster", 1000.0, 1234);
        konto.einzahlen(250.0);
        System.out.println("Abheben falsche PIN: " + konto.abheben(100.0, 9999));
        System.out.println("Abheben richtige PIN: " + konto.abheben(250.0, 1234));
        ZinsService.verzinsen(konto, 2.0);
        System.out.println(konto.getInhaber() + ": " + konto.getKontostand() + " CHF");
    }
}
