package creationalPatterns.singleton.singletonEager;

public class SingletonEager1 {
    private static final SingletonEager1 instance = new SingletonEager1();
    private SingletonEager1() {}

    public static SingletonEager1 getInstance() {
        return instance;
    }
}

class EagerMain {
    public static void main(String[] args) {
        SingletonEager1 singletonEager1 = SingletonEager1.getInstance();
        SingletonEager1 singletonEager2 = SingletonEager1.getInstance();
        System.out.println(singletonEager1 == singletonEager2);
    }
}