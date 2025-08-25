package structuralPattern.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Payment payment = new BasicPayment();

        Payment loggedPayment = new LoggingPaymentDecorator(payment);
//        loggedPayment.pay(100);
        Payment securePayment = new EncryptionPaymentDecorator(loggedPayment);
        securePayment.pay(500);

    }
}
