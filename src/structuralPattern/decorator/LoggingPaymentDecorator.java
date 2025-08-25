package structuralPattern.decorator;

public class LoggingPaymentDecorator extends PaymentDecorator{
    public LoggingPaymentDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        System.out.println("LOG payment Started");
        super.pay(amount);
        System.out.println("LOG payment finish");
    }
}
