package structuralPattern.decorator;

public class EncryptionPaymentDecorator extends PaymentDecorator{
    public EncryptionPaymentDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Encrypting payment data...");
        super.pay(amount);
    }
}
