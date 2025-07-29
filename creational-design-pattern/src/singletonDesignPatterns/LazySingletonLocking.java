package singletonDesignPatterns;

public class LazySingletonLocking {
    private static LazySingletonLocking lazySingletonLocking;

    private LazySingletonLocking() {

    }
    // Efficient - Synchronization only happens once, when the instance is created.
    public static LazySingletonLocking getLazySingleton() {
        synchronized (LazySingletonLocking.class) {
            if (lazySingletonLocking == null) {
                return new LazySingletonLocking();
            }
        }
        return lazySingletonLocking;
    }
}

class LazyLockingMain {
    public static void main(String[] args) {
        LazySingletonLocking obj1 = LazySingletonLocking.getLazySingleton();
        LazySingletonLocking obj2 = LazySingletonLocking.getLazySingleton();
        if(obj2 == obj1) {
            System.out.println(Boolean.TRUE);
        }
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
