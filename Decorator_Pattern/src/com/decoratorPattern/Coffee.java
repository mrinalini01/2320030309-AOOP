package com.decoratorPattern;

class Coffee implements Beverage{

	@Override
	public String getDescription() {
		return "Coffee";
	}

	@Override
	public double getCost() {
		return 20.0;
	}

}
