package com.facadePattern;

public class Projector {
	public void on() {
		System.out.println("projector is on.");
	}
	
	public void off() {
		System.out.println("Projector is off.");
	}

	public void setInput(String input) {
        System.out.println("Projector input set to " + input);
    }
}
