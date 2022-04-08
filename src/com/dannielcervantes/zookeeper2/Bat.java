package com.dannielcervantes.zookeeper2;

public class Bat extends Mammal {
	// Attributes 
	
	
	// Constructor
	public Bat() {
		super();
	}
	
	
	// Getters / Setters
	
	
	
	// Methods
	public void fly() {
		System.out.println("I'm a Bat! Watch me flap!");
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Blah! Blah! Blood!");
		energyLevel += 25; 
	}
	public void attackTown() {
		System.out.println("*Lights matches and throws on roofs*");
		energyLevel -= 100;
	}
	
	
	
	
	
	
}
