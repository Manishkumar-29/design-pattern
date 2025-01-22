package creationalPatterns.singleton.billPughSingletion;

/**
 * The Bill Pugh Singleton is an efficient way to implement the Singleton pattern in Java, making use of the Java classloader mechanism.
 * It leverages the static inner class to implement lazy initialization while maintaining thread safety without the performance
 * overhead of synchronization.
 */
public class BillPughSingleton {

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

class Main {
    public static void main(String[] args) {
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        BillPughSingleton instance2 = BillPughSingleton.getInstance();

        System.out.println(instance1 == instance2);
    }
}
