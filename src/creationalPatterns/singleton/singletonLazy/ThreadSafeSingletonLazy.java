package creationalPatterns.singleton.singletonLazy;

/**
 * A thread safe singleton is created so that singleton property is maintained even in multithreaded environment.
 * To make a singleton class thread safe, getInstance() method is made synchronized so that multiple threads can’t access it simultaneously.
 */
public class ThreadSafeSingletonLazy {
    private static ThreadSafeSingletonLazy instance;

    private ThreadSafeSingletonLazy(){}

    public static synchronized ThreadSafeSingletonLazy getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingletonLazy();
        }
        return instance;
    }

}

class Main1 {
    public static void main(String[] args) {
        ThreadSafeSingletonLazy instance1 = ThreadSafeSingletonLazy.getInstance();
        ThreadSafeSingletonLazy instance2 = ThreadSafeSingletonLazy.getInstance();
        System.out.println(instance1 == instance2);

    }
}
