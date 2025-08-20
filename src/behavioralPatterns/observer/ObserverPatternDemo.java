package behavioralPatterns.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();

        Observer sub1 = new Subscriber("Alice");
        Observer sub2 = new Subscriber("Bob");
        Observer sub3 = new Subscriber("Sachin");

        publisher.attach(sub1);
        publisher.attach(sub2);
        publisher.attach(sub3);

        publisher.notifyObservers("Breaking News: Observer Pattern in Action!");
        publisher.detach(sub2);

        publisher.notifyObservers("Breaking News: some observer is remove!");
    }
}
