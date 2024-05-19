package inheritance;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("David","Male", 18);
		Toddler t = new Toddler("Goliath", "Male", 2, "Peekaboo");
		Kid k = new Kid("Mark", "Male", 3, "Preso",5);
		
		p.checkStatus();
		t.checkStatus();
		t.drink();
		k.sayGradeLevel();
		
	}

}
