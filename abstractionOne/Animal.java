package abstractionOne;

public abstract class Animal {
	
	abstract void makeSound();
	abstract void walk();
	
	String name;
	
	void showName() {
		System.out.println("Name : " + name);
	}
	
	void setName(String name) {
		this.name = name;
	}
}
