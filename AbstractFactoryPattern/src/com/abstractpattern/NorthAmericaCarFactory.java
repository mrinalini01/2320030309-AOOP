package com.abstractpattern;

class NorthAmericaCarFactory implements CarFactory {
    public Car createCar() {
        return new Sedan();
    }

    public CarSpecification createSpecification() {
        return new NorthAmericaCarSpecification();
    }
}
