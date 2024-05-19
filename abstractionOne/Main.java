package abstractionOne;

public class Main {

	public static void main(String[] args) {
		
		Animal d = new Dog();
		Animal c = new Cat();
		
		d.setName("Lulu");
		c.setName("Lily");
		
		d.showName();
		d.makeSound();
		d.walk();
		
		c.showName();
		c.makeSound();
		c.walk();
	}

}
