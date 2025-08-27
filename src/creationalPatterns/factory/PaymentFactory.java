package creationalPatterns.factory;

public class PaymentFactory {

    public static Payment buildPayment(String paymentType) {
        if("UPI".equalsIgnoreCase(paymentType)) {
            return new UPIPayment();
        } else if("CREDIT_CARD".equalsIgnoreCase(paymentType)) {
            return new CreditCardPayment();
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
