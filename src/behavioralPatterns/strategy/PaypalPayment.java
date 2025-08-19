package behavioralPatterns.strategy;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paypal payment:" + amount);
    }
}
