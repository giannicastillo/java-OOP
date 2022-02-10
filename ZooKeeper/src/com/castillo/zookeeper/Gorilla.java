package com.castillo.zookeeper;
public class Gorilla extends Mammal{
	
	public int throwSomething = -5; 
	public int eatBananas = +10;
	public int climb = -10;
	
	public void throwingSomething() {
		if(energyLevel > throwSomething) {
			this.energyLevel += throwSomething;
			
		}
		
		System.out.printf("You threw an item \n lost 5 points \n and have %s of energy left!", energyLevel);
	}
	
	public void eatingBananas() {
		if(this.energyLevel > eatBananas) {
			this.energyLevel += eatBananas;
			
		}
		
		System.out.printf("Ate Banana \n Gained 10 points \n Energy is now %s", energyLevel);
		
	}
	
	public void climbing() {
		if (this.energyLevel > climb) {
			this.energyLevel += climb;
			
		}
		
		System.out.printf("Lost 10 Points from climb \n Energy is now %s", energyLevel);
	}
}
