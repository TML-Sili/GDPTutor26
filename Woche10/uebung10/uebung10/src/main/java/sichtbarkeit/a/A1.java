package sichtbarkeit.a;

public class A1 {

    protected static void a11() {
        System.out.println("a11");
        A1.a12();
    }

    private static void a12() {
        System.out.println("a12");
        A2.a21();
    }
}
