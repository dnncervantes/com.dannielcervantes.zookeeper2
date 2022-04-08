package com.dannielcervantes.zookeeper2;

public class Mammal {
	//member variables
	protected int energyLevel = 300;
	
	//constructor
	public Mammal() {
		
	}
	
	//getters / setters
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	
	//methods
	public void displayEnergy() {
		System.out.println("Energy level = " + this.getEnergyLevel());
	}

}	

