package singletonDesignPatterns;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public static LazySingleton getLazySingleton() {
        if(lazySingleton == null) {
            return new LazySingleton();
        }
        return lazySingleton;
    }
}

class LazyMain {
    public static void main(String[] args) {
        LazySingleton obj1 = LazySingleton.getLazySingleton();
        LazySingleton obj2 = LazySingleton.getLazySingleton();
        if(obj2 == obj1) {
            System.out.println(Boolean.TRUE);
        }
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
