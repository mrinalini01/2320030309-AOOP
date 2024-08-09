package com.factorydesign;

public class Client {

	public static void main(String[] args) {
	    	
		PizzaFactory factory = new PizzaFactory();
	    PizzaStore store = new PizzaStore(factory);

	    Pizza pizza1 = store.orderPizza("cheese");
	    System.out.println("Ordered a " + pizza1.getName() + "\n");

	    Pizza pizza2 = store.orderPizza("pepperoni");
	    System.out.println("Ordered a " + pizza2.getName() + "\n");

	    Pizza pizza3 = store.orderPizza("veggie");
	    System.out.println("Ordered a " + pizza3.getName() + "\n");

	    Pizza pizza4 = store.orderPizza("seafood");
	    if (pizza4 == null) {
	            System.out.println("Could not order seafood pizza.\n");
	        }
	    }
	}
