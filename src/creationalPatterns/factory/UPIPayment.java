package creationalPatterns.factory;

public class UPIPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment through UPI: "+amount);
    }
}
