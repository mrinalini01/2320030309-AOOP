package com.decoratorPattern;

public class BeverageShop {
    public static void main(String[] args) {
    	
        // Simple Coffee
        Beverage beverage = new Coffee();
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        // Coffee with Milk
        beverage = new MilkDecorator(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        // Coffee with Milk and Sugar
        beverage = new SugarDecorator(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        // Coffee with Milk, Sugar, and Chocolate
        beverage = new ChocolateDecorator(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        // Tea with Chocolate and Sugar
        Beverage tea = new Tea();
        tea = new ChocolateDecorator(tea);
        tea = new SugarDecorator(tea);
        System.out.println(tea.getDescription() + " $" + tea.getCost());
    }
}
