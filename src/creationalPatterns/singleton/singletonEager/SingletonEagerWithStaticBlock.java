package creationalPatterns.singleton.singletonEager;

/**
 * This is also a sub part of Eager initialization. The only difference is object is created in a static block so that we can have access on its creation,
 * like exception handling. In this way also, object is created at the time of class loading.
 * It can be used when there is a chance of exceptions in creating object with eager initialization
 */
public class SingletonEagerWithStaticBlock {

    public static SingletonEagerWithStaticBlock instance;

    private SingletonEagerWithStaticBlock() {
    }

    static {
        try {
            instance = new SingletonEagerWithStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        // Access the singleton instance
        SingletonEagerWithStaticBlock singletonEager1 = SingletonEagerWithStaticBlock.instance;
        SingletonEagerWithStaticBlock singletonEager2 = SingletonEagerWithStaticBlock.instance;
        // compare the instance are same or not
        System.out.println(singletonEager1 == singletonEager2);
    }
}
