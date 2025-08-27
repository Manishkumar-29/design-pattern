package creationalPatterns.abstractFactory.example;

public class StripePaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe payment proceed: "+ amount);
    }
}
