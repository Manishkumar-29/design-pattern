package creationalPatterns.abstractFactory.example;

public interface PaymentGatewayFactory {
    PaymentProcessor createPaymentProcessor();
    RefundProcessor createRefundProcessor();
}
