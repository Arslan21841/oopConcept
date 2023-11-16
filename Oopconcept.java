// Example of a simple class and object in Java
package oopconcept;
 class Car {
    // Attributes
    String make;
    String model;
    int year;

    // Methods
    void start() {
        System.out.println("Car started!");
    }

    void stop() {
        System.out.println("Car stopped!");
    }
}

public class Oopconcept {
    public static void main(String[] args) {
     Car car=new Car();
     car.start();
     car.stop();
    }
}
