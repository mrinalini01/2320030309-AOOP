package com.factorydesign;

class PizzaStore {
	
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

	public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } 
        else {
            System.out.println("Sorry, that pizza isn't available.");
        }

        return pizza;
    }


}
