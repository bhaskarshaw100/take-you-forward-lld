package singletonDesignPatterns;

public class SingletonBillPugh {

    private SingletonBillPugh() {
    }

    public static class Holder {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return Holder.INSTANCE;
    }
}

class BillPughMain {
    public static void main(String[] args) {
        SingletonBillPugh obj1 = SingletonBillPugh.getInstance();
        SingletonBillPugh obj2 = SingletonBillPugh.getInstance();
        if(obj2 == obj1) {
            System.out.println(Boolean.TRUE);
        }
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
