package abstactionTwo;

public class Bird  implements Animal, LandAnimal, AirAnimal{
	public void makeSound() {
		System.out.println("Chirp!");
	}

	public void fly() {
		System.out.println("Fly 100 meters");
	}

	public void walk() {
		System.out.println("Walk 10 meters");
	}
}
