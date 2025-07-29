package singletonDesignPatterns;

public class EagerSingleton {
    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {

    }
    public static EagerSingleton getEagerSingleton() {
        return eagerSingleton;
    }
}



class EagerMain {
    public static void main(String[] args) {
        EagerSingleton obj1 = EagerSingleton.getEagerSingleton();
        EagerSingleton obj2 = EagerSingleton.getEagerSingleton();
        if(obj2 == obj1) {
            System.out.println(Boolean.TRUE);
        }
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

