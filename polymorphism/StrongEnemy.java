package polymorphism;

public class StrongEnemy extends Enemy {
	
	StrongEnemy() {
		name = "Strong Enemy";
		hp = 100;
			
	}
	
	StrongEnemy(String name) {
		this.name = name;
		hp = 100;
	}
	
	void dialog() {
		System.out.println(name + " :I'm Strong!");
	}
}
