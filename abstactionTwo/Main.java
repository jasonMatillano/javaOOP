package abstactionTwo;

public class Main {

	public static void main(String[] args) {
		
//		Animal a = new Animal();
		
		Dog d = new Dog();
		Bird b = new Bird();
		Frog f = new Frog();
		
		d.makeSound();
		b.makeSound();
		f.makeSound();
		
		f.walk();
		
		
	}

}
