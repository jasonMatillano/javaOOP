package inheritance;

public class Kid extends Toddler{
	
	Kid(String name, String sex, int age, String favGame) {
		super(name, sex, age, favGame);
		// TODO Auto-generated constructor stub
	}

	int gradeLevel;
	
	Kid(String name, String sex, int age, String favGame,int gradeLevel) {
		super(name,sex,age,favGame);
		this.gradeLevel = gradeLevel;
	}
	
	void sayGradeLevel() {
		System.out.println("I am grade level: " + gradeLevel);
	}
}
