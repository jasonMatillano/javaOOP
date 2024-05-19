package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Enemy we = new WeakEnemy();
		Enemy se = new StrongEnemy("Jason");
		
		
		se.showStats();
		se.dialog();
	}

}
