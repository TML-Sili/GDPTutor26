package sichtbarkeit.a;

// public: B1 im Paket sichtbarkeit.b erbt von A1.
public class A1 {

    // protected: Zugriff aus A2 (gleiches Paket) UND aus Unterklasse B1 (anderes Paket).
    protected static void a11() {
        System.out.println("a11");
        A1.a12();
    }

    // private: wird nur innerhalb von A1 aufgerufen.
    private static void a12() {
        System.out.println("a12");
        A2.a21();
    }
}
