package fundamentals;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Employee e = new Employee ("David", "Angel", "Programmer", "Mars","Male",24);
		
		Employee e1 = new Employee ("Goliath", "Angel", "Programmer");
	
		Employee e2 = new Employee();
		
		System.out.println(e2.firstName);
	}
}