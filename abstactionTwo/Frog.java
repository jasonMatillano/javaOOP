package abstactionTwo;

public class Frog implements Animal, LandAnimal, WaterAnimal{
	public void makeSound() {
		System.out.println("Ribit!");
	}


	public void swim() {
		System.out.println("Swim 20 meters");
		
	}

	
	public void walk() {
		System.out.println("Walk 10 meters");
		
	}
}
