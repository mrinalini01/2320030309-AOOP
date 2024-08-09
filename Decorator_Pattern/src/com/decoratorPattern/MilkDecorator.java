package com.decoratorPattern;

class MilkDecorator extends BeverageDecorator{

	public MilkDecorator(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}
	
	public double getCost() {
		return beverage.getCost() + 5.0;
	}
}
