package singletonDesignPatterns;

public class LazySingletonSynchronized {
    private static LazySingletonSynchronized lazySingletonSynchronized;

    private LazySingletonSynchronized() {

    }
    // Very Inefficient - Every call to getInstance() is synchronized, even after the instance is created.
    public static synchronized LazySingletonSynchronized getLazySingleton() {
        if(lazySingletonSynchronized == null) {
            return new LazySingletonSynchronized();
        }
        return lazySingletonSynchronized;
    }
}

class LazySynchronizedMain {
    public static void main(String[] args) {
        LazySingletonSynchronized obj1 = LazySingletonSynchronized.getLazySingleton();
        LazySingletonSynchronized obj2 = LazySingletonSynchronized.getLazySingleton();
        if(obj2 == obj1) {
            System.out.println(Boolean.TRUE);
        }
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
