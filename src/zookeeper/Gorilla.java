package zookeeper;

public class Gorilla extends Mammal{
	
	public void throwSomething() {
		System.out.println("Holy cow! That gorilla just threw something!");
		energy -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Dang that gorilla looks awfully satisfied after eating that banana!");
		energy += 10;
	}
	
	public void climb() {
		System.out.println("Wow! Look how high that gorilla climbed up the tree!");
		energy -= 10;
	}
}
