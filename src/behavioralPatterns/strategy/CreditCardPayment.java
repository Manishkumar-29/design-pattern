package behavioralPatterns.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("credit card payment :" + amount);
    }
}
