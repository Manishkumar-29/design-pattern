package creationalPatterns.factory;

/**
 * The Factory Method Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass,
 * allowing subclasses to alter the type of objects that will be created. This pattern is particularly useful when
 * the exact types of objects to be created may vary or need to be determined at runtime, enabling flexibility and
 * extensibility in object creation.
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

// when use factory method design pattern
//If your object creation process is complex or varies under different conditions, using a factory method can make your client code simpler and promote reusability.
//The Factory Method Pattern allows you to create objects through an interface or abstract class, hiding the details of concrete implementations. This reduces dependencies and makes it easier to modify or expand the system without affecting existing code.
//If your application needs to create different versions of a product or may introduce new types in the future, the Factory Method Pattern provides a flexible way to handle these variations by defining specific factory methods for each product type.
//Factories can also encapsulate configuration logic, allowing clients to customize the object creation process by providing parameters or options to the factory method.
