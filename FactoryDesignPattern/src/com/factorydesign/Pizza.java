package com.factorydesign;

abstract class Pizza {
    String name;
    String dough;
    String sauce;

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
    }

    void bake() {
        System.out.println("Baking " + name);
    }

    void cut() {
        System.out.println("Cutting " + name + " into slices.");
    }

    void box() {
        System.out.println("Placing " + name + " into the box.");
    }

    String getName() {
        return name;
    }
}