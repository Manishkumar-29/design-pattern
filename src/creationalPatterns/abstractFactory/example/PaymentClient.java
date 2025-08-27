package creationalPatterns.abstractFactory.example;

public class PaymentClient {
    public static void main(String[] args) {
        PaymentGatewayFactory factory = new PayPalFactory();
        PaymentProcessor paymentProcessor = factory.createPaymentProcessor();
        RefundProcessor refundProcessor = factory.createRefundProcessor();

        paymentProcessor.processPayment(100);
        refundProcessor.processRefund(50);

        PaymentGatewayFactory factory2 = new StripeFactory();
        PaymentProcessor paymentProcessor2 = factory2.createPaymentProcessor();
        RefundProcessor refundProcessor2 = factory2.createRefundProcessor();

        paymentProcessor2.processPayment(1000);
        refundProcessor2.processRefund(500);
    }
}
