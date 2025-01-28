package creationalPatterns.factory;

/**
 The Factory Design Pattern is a creational design pattern in Java that provides a way to create objects without specifying
 the exact class of object that will be created. It is used when the client code doesn't need to know which specific class it is using,
 and the creation logic is centralized in a single place (the factory).
 */
public class Main {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client client = new Client(twoWheelerFactory);
        Vehicle twoWheeler = client.getVehicle();
        twoWheeler.printVehicle();
        Vehicle twoWheeler2 = client.getVehicle();
        twoWheeler2.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client client2 = new Client(fourWheelerFactory);
        Vehicle fourWheeler = client2.getVehicle();
        fourWheeler.printVehicle();
        Vehicle fourWheeler2 = client2.getVehicle();
        fourWheeler2.printVehicle();
    }
}
/**
  <== when use factory method design pattern ==>
 1. If your object creation process is complex or varies under different conditions, using a factory method can make your
    client code simpler and promote reusability.
 2. The Factory Method Pattern allows you to create objects through an interface or abstract class,
    hiding the details of concrete implementations. This reduces dependencies and makes it easier to modify or expand the system without affecting existing code.
 3. If your application needs to create different versions of a product or may introduce new types in the future,
    the Factory Method Pattern provides a flexible way to handle these variations by defining specific factory methods for each product type.
 4. Factories can also encapsulate configuration logic, allowing clients to customize the object creation process by providing
    parameters or options to the factory method.
 */

/**
 Key Features of Factory Pattern:
 1. Encapsulation of Object Creation: The logic for creating objects is moved to the factory, so the client code only interacts with
                                        the factory.
 2. Abstraction: The client only knows about the interface or abstract class the object implements, not the actual implementation.
 3. Flexibility: Adding new types of objects becomes easier without changing client code.
 */