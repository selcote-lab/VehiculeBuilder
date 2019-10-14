package com.tonasolution;

interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicule();
}

class CarBuilder implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicule() {
        return product;
    }
}

class MotocycleBuilder implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a Motocycle");
    }

    @Override
    public void insertWheels() {
        product.add("3 wheels are added to a Motocycle");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlights are added to a Motocycle");
    }

    @Override
    public Product getVehicule() {
        return product;
    }
}
