package com.dannielcervantes.zookeeper2;

public class BatTest {
	public static void main(String[] args) {
		Bat alucard = new Bat();
		
		alucard.fly();
		alucard.displayEnergy();
		
		alucard.attackTown();
		alucard.displayEnergy();
		
		alucard.eatHumans();
		alucard.displayEnergy();
		
		alucard.attackTown();
		alucard.displayEnergy();
		
		alucard.eatHumans();
		alucard.displayEnergy();
		
		alucard.attackTown();
		alucard.displayEnergy();
		
		alucard.fly();
		alucard.displayEnergy();
	}

}
