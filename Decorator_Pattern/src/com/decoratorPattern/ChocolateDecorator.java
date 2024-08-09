package com.decoratorPattern;

class ChocolateDecorator extends BeverageDecorator{

	public ChocolateDecorator(Beverage beverage) {
		super(beverage);
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Chocolate";
	}
	
	public double getCost() {
		return beverage.getCost() + 4.0;
	}

}
