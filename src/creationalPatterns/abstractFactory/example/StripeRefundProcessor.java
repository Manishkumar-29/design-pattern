package creationalPatterns.abstractFactory.example;

public class StripeRefundProcessor implements RefundProcessor{
    @Override
    public void processRefund(double amount) {
        System.out.println("Stripe refund initiate: " + amount);
    }
}
