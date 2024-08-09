package com.decoratorPattern;

class SugarDecorator extends BeverageDecorator{

	public SugarDecorator(Beverage beverage) {
		super(beverage);
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Sugar";
	}

	public double getCost() {
		return beverage.getCost() + 3.0;
	}
}
