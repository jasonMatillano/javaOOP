package arrayOfObjects;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("How many student to be registered?");
		int size = s.nextInt();
		s.nextLine();
		
		Student students[] = new Student[size];
		
		for(int i = 0; i < students.length ; i++) {
			
			String firstName, lastName, course;
			int year;
			char section;
			
			System.out.println("Student #" + (i+1));
			System.out.println();
			
			System.out.print("First Name : ");
			firstName = s.nextLine();
			
			System.out.print("Last Name : ");
			lastName = s.nextLine();
			
			System.out.print("Course : ");
			course = s.nextLine();
			
			System.out.print("Year : ");
			year = s.nextInt();
			s.nextLine();
			
			System.out.print("Section : ");
			section = s.nextLine().charAt(0);
			System.out.println();
			
			students [i] = new Student(firstName, lastName, course, year, section);
			
		}
		
		for(Student stud:students) {
			stud.introduceSelf();
			System.out.println();
		}
		
	}

}
