package creationalPatterns.abstractFactory.example;

public class StripeFactory implements PaymentGatewayFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new StripePaymentProcessor();
    }

    @Override
    public RefundProcessor createRefundProcessor() {
        return new StripeRefundProcessor();
    }
}
