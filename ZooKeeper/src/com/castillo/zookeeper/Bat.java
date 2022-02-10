package com.castillo.zookeeper;

public class Bat {
	//member variables, attributes, and fields 
		double energyLevel = 300;
		double fly = -50;
		double eatHumans = 25;
		double attackTown = -100;
		
	
		
	public void flying() {
		if(energyLevel >= fly) {
			this.energyLevel += fly;
			System.out.println("yurrrrhhh");
			
		
		}}
		// CHEATED A LITTLE ON THE LINE BELOW 			
	public void eatingHumans() {
		if(energyLevel <= eatHumans) {
			this.energyLevel += eatHumans;
			
		System.out.println("IT'S GETTING STRONGER!!!");
			
		}}
		
		
	public void attackOnTown() {{
		if(energyLevel >= attackTown) {
			this.energyLevel += attackTown;
			
			System.out.println("ATTACK TOWN!!! ");
			
		}
		
		
		
	}}
	
	
	
	
		
	}
