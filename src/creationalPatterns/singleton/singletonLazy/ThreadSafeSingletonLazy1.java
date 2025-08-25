package creationalPatterns.singleton.singletonLazy;

public class ThreadSafeSingletonLazy1 {

    private static ThreadSafeSingletonLazy1 instance;

    private ThreadSafeSingletonLazy1(){}

    public static synchronized ThreadSafeSingletonLazy1 getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingletonLazy1();
        }
        return instance;
    }
}

class ThreadSafeSingletonLazy1Test {
    public static void main(String[] args) {
        ThreadSafeSingletonLazy1 instance1 = ThreadSafeSingletonLazy1.getInstance();
        ThreadSafeSingletonLazy1 instance2 = ThreadSafeSingletonLazy1.getInstance();
        System.out.println(instance1 == instance2);
    }
}
