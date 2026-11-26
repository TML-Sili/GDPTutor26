package sichtbarkeit3.basis;

// package-private: wird nur aus Basis im selben Paket verwendet.
class Nachbar {

    // package-private: wird nur aus Basis im selben Paket aufgerufen.
    static void zeige(Basis b) {
        Basis neu = new Basis();
        System.out.println(b.paketWert + neu.paketWert);
    }
}
