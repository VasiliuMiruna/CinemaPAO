package service;

//pentru moment doar am pus exemplul de la laborator,
//urmeaza sa ii fac o implementare

@FunctionalInterface
public interface DBConnection {
    void connect();

    default void m1() {
        System.out.println("Hello");
    }

    static void m2() {
        System.out.println("Hello");
    }
}
