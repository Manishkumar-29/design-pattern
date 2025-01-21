package creationalPatterns.singleton.singletonEager;
/**
 * This is the simplest method of creating a singleton class. In this, object of class is created when it is loaded to the memory by JVM.
 * It is done by assigning the reference of an instance directly.
 * It can be used when program will always use instance of this class,
 * or the cost of creating the instance is not too large in terms of resources and time
 */

// when use singleton class
/**
 *Eager initialization is easy to implement but it may cause resource and CPU time wastage.
 * Use it only if cost of initializing a class is less in terms of resources or your program will always need the instance of class
 */
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        // Access the singleton instance
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        // compare the instance are same or not
        System.out.println(singletonEager1 == singletonEager2);
    }
}
