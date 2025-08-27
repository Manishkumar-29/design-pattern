package creationalPatterns.factory;

public class PaymentMain {

    public static void main(String[] args) {
        Payment payment = PaymentFactory.buildPayment("UPI");
        payment.pay(500);

        payment = PaymentFactory.buildPayment("CREDIT_CARD");
        payment.pay(1500);
    }
}
