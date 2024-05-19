package inheritance;

public class Toddler extends Person{
	
	String favGame;
	
	Toddler(String name, String sex, int age, String favGame ) {
		super(name,sex,age);
		this.favGame = favGame;
	}
	
	void drink() {
		System.out.println(name + " is drink beer");
	}
	
	void checkStatus() { 
		super.checkStatus();
		System.out.println("Favorite game: " + favGame);
	}
}
