package creationalPatterns.singleton.singletonLazy;

public class SingletonLazy1 {

    private static SingletonLazy1 instance;

    private SingletonLazy1() {
    }

    public static SingletonLazy1 getInstance() {
        if (instance == null) {
            instance = new SingletonLazy1();
        }
        return instance;
    }
}

class SingletonLazy1Test {
    public static void main(String[] args) {
        SingletonLazy1 singletonLazy1 = SingletonLazy1.getInstance();
        SingletonLazy1 singletonLazy2 = SingletonLazy1.getInstance();
        System.out.println(singletonLazy1 == singletonLazy2);
    }
}
