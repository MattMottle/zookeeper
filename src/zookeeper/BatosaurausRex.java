package zookeeper;

public class BatosaurausRex extends Mammal {
	
	public BatosaurausRex() {
		this.energy = 300;
	}
	
	public void fly() {
		System.out.println("Holy guacomole! Look at that giant bat take flight!");
		energy -= 50;
	}
	public void eatHumans() {
		System.out.println("OMG this giant bat is eating me, a human, and looks so satisfied while it does it!");
		energy += 25;
	}
	
	public void attackTown() {
		System.out.println("What the heck! This giant bat is destroying our town! What a dick!");
		energy -= 100;
	}
}
