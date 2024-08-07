package com.abstractpattern;

class EuropeCarFactory implements CarFactory {
    public Car createCar() {
        return new Hatchback();
    }

    public CarSpecification createSpecification() {
        return new EuropeCarSpecification();
    }
}
