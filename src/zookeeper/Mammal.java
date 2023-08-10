package zookeeper;

public class Mammal {
	//member variables
	public int energy;
	//constructor
	public Mammal() {
		this.energy = 100;
	}
	//mammal methods
	public void displayEnergy() {
		System.out.println("Your energy level is " + this.energy);
	}
	//getter and setter
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
}
