package bank.modell;

public class ZinsService {

    public static void verzinsen(Bankkonto konto, double prozent) {
        if (konto != null) {
            konto.gutschriftZins(prozent);
        }
    }
}
