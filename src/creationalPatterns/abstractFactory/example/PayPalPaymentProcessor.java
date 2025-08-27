package creationalPatterns.abstractFactory.example;

public class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal Proceed payment: " + amount);
    }
}
