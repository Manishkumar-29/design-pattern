package structuralPattern.decorator;

public class BasicPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("processing payment of " + amount);
    }
}
