package creationalPatterns.abstractFactory;

/**
 The Abstract Factory Design Pattern is a creational design pattern used when you need to create families of related or dependent
 objects without specifying their concrete classes. It provides an interface to create a series of related objects, which makes
 it easier to enforce consistency among objects.
 */
public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            factory = new WindowsOSFactory();
        } else if (os.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported OS");
        }

        // Create and render application
        Application app = new Application(factory);
        app.render();
    }
}

/**
 <== Key Components ==>
 1. Abstract Factory: An interface that declares methods for creating abstract products.
 2. Concrete Factory: A class that implements the abstract factory interface and creates concrete products.
 3. Abstract Product: An interface or abstract class for defining a type of product.
 4. Concrete Product: A class that implements the abstract product interface.
 5. Client: The client interacts with the factory to create objects. It does not need to know the concrete implementations.
 */

/**
 * Difference between Abstract Factory and Factory Method:
 * 1. Purpose: The main difference is that the Abstract Factory is used when you need to create families of related objects,
 *    while the Factory Method is used when you need to create objects of a single product family.
 * 2. Implementation: The Abstract Factory typically has multiple factory methods for creating different types of products,
 *    while the Factory Method typically has a single factory method for creating a single product.
 * 3. Flexibility: The Abstract Factory allows you to create a family of related objects, while the Factory Method
 *    creates a single object. The Abstract Factory is more flexible as it can create a family of related objects,
 *    while the Factory Method is more rigid as it creates a single object.
 *
  ----------- Analogy -----------------
 1. Factory Method: Like a restaurant specializing in a single dish where you choose the specific recipe (e.g., pizza with different toppings).
 2. Abstract Factory: Like a full-service meal where you order a complete meal set (starter, main course, dessert) that matches a theme (e.g., Italian or French cuisine).
 --------- Summary --------------------
 1. Use Factory Method when you need to create objects from a single product family.
 2. Use Abstract Factory when you need to create multiple related objects that belong to the same family.
 */
