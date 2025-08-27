package creationalPatterns.abstractFactory.example;

public class PayPalFactory implements PaymentGatewayFactory{
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new PayPalPaymentProcessor();
    }

    @Override
    public RefundProcessor createRefundProcessor() {
        return new PayPalRefundProcessor();
    }
}
