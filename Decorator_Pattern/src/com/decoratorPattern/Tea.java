package com.decoratorPattern;

class Tea implements Beverage{

	@Override
	public String getDescription() {
		return "Tea";	
	}

	@Override
	public double getCost() {
		return 30.0;
	}

}
