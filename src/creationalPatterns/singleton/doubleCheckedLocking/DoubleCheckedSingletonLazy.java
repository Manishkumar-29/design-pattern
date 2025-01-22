package creationalPatterns.singleton.doubleCheckedLocking;

/**
 *  In Double-Checked Locking, we overcome the overhead problem of synchronized code.
 *  In this method, getInstance is not synchronized but the block which creates instance is synchronized
 *  so that minimum number of threads have to wait and that’s only for first time.
 */
public class DoubleCheckedSingletonLazy {

    private static DoubleCheckedSingletonLazy instance;

    private DoubleCheckedSingletonLazy(){}

    public static DoubleCheckedSingletonLazy getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingletonLazy.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingletonLazy();
                }
            }
        }
        return instance;
    }
}

class DoubleCheckedSingletonLazyDemo {
    public static void main(String[] args) {
        DoubleCheckedSingletonLazy instance1 = DoubleCheckedSingletonLazy.getInstance();
        DoubleCheckedSingletonLazy instance2 = DoubleCheckedSingletonLazy.getInstance();

        System.out.println(instance1 == instance2);
    }
}
