package com.tonasolution;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** Builder Pattern Demo *** ");
        Director director = new Director();

        BuilderInterface carBuilder = new CarBuilder();
        BuilderInterface motocycleBuilder = new MotocycleBuilder();

        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicule();
        p1.show();

        director.construct(motocycleBuilder);
        Product p2 = motocycleBuilder.getVehicule();
        p2.show();
    }
}
