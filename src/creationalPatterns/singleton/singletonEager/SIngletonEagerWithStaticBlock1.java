package creationalPatterns.singleton.singletonEager;

public class SIngletonEagerWithStaticBlock1 {

    public static SIngletonEagerWithStaticBlock1 instance;

    private SIngletonEagerWithStaticBlock1(){}


    static {
        try {
            instance = new SIngletonEagerWithStaticBlock1();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        SIngletonEagerWithStaticBlock1 singletonEager1 = SIngletonEagerWithStaticBlock1.instance;
        SIngletonEagerWithStaticBlock1 singletonEager2 = SIngletonEagerWithStaticBlock1.instance;
        System.out.println(singletonEager1 == singletonEager2);
    }
}
