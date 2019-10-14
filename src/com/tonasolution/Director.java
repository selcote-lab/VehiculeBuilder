package com.tonasolution;

public class Director {
    private BuilderInterface builder;

    public void construct(BuilderInterface builder){
        this.builder = builder;
        this.builder.buildBody();
        this.builder.insertWheels();
        this.builder.addHeadlights();
    }
}
