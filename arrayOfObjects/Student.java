package arrayOfObjects;

public class Student {
	
	private String firstName, lastName;
	private String course;
	private int year;
	private char section;
	
	Student (
			String firstName,
			String lastName,
			String course,
			int year,
			char section
			) { 
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.year = year;
		this.section = section;
		
	}
	
	void introduceSelf() {
		System.out.println("Fullname : " + firstName + " " + lastName);
		// BSIT - 1A
		System.out.println("C/Y/S    : " + course + " - " + year + section);
	}
	
}
