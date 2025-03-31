package MethodOverridding;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Example of Vehicle Hierarchy:");
        
        Bike bike = new Bike("Yamaha", "Sports");
        bike.displayInfo();
        bike.start();
        bike.stop();
        
        System.out.println();
        
        Car car = new Car("Toyota", "SUV");
        car.displayInfo();
        car.start();
        car.stop();
    }
}

class Vehicle {
    String brand;
    int wheels;
    
    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }
    
    void displayInfo() {
        System.out.println("Vehicle Brand: " + brand + ", Wheels: " + wheels);
    }
    
    void start() {
        System.out.println("Starting the vehicle: " + brand);
    }
    
    void stop() {
        System.out.println("Stopping the vehicle: " + brand);
    }
}

class TwoWheeler extends Vehicle {
    String type;
    
    TwoWheeler(String brand, String type) {
        super(brand, 2);
        this.type = type;
    }
    
    @Override
    void displayInfo() {
        System.out.println("Two-Wheeler Brand: " + brand + ", Type: " + type + ", Wheels: " + wheels);
    }
}

class FourWheeler extends Vehicle {
    String type;
    
    FourWheeler(String brand, String type) {
        super(brand, 4);
        this.type = type;
    }
    
    @Override
    void displayInfo() {
        System.out.println("Four-Wheeler Brand: " + brand + ", Type: " + type + ", Wheels: " + wheels);
    }
}

class Bike extends TwoWheeler {
    Bike(String brand, String type) {
        super(brand, type);
    }
    
    @Override
    void start() {
        System.out.println("Starting the bike" );
    }
    
    @Override
    void stop() {
        System.out.println("Stopping the bike" );
    }
}

class Car extends FourWheeler {
    Car(String brand, String type) {
        super(brand, type);
    }
    
    @Override
    void start() {
        System.out.println("Starting the car");
    }
    
    @Override
    void stop() {
        System.out.println("Stopping the car");
    }
}