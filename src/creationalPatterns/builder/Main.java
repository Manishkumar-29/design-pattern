package creationalPatterns.builder;

/**
    The Builder Design Pattern is a creational design pattern that allows constructing complex objects step by step.
    It provides a clear and readable way to create objects with multiple optional parameters without needing a large constructor
    with many arguments.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels(4)
                .setSunroof(true)
                .build();

        System.out.println(car);

        Car car1 = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels(4)
                .build();

        System.out.println(car1);
    }
}

/*
    When to Use the Builder Pattern?
    1. When an object has a large number of optional parameters.
    2. When you need to ensure immutability after creation.
    3. When creating an object requires multiple steps.
 */

/*
    Structure of the Builder Pattern
    1. Product: The complex object being built.
    2. Builder Interface: Specifies the steps to build the product.
    3. Concrete Builder: Implements the builder interface.
    4. Director (Optional): Defines the order of building steps.
    5. Client: Uses the builder to construct the object.
 */