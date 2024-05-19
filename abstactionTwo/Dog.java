package abstactionTwo;

public class Dog implements Animal, LandAnimal{
	
	public void makeSound() {
		System.out.println("Arrf!");
	}
	
	public void walk() {
		System.out.println("Walk 10 meters");
	}
	
}
