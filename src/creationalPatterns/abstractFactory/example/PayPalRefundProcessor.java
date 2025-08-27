package creationalPatterns.abstractFactory.example;

public class PayPalRefundProcessor implements RefundProcessor{
    @Override
    public void processRefund(double amount) {
        System.out.println("Paypal Initiate refund: " + amount);
    }
}
