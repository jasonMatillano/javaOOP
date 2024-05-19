package polymorphism;

public class Enemy {
	
	String name;
	int hp;
	
	void dialog() {
		System.out.println("Override Me!");
	}
	
	void showStats() {
		System.out.println("Name: " + name);
		System.out.println("HP: " + hp);
	}
	
}
