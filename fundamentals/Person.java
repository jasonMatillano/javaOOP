package fundamentals;

public class Person {
	
	String firstName;
	String lastName;
	char sex;
	int age;
	
	Person (String firstName, String lastName ,char sex, int age ) {
		
		this.firstName = firstName;
		this.lastName =  lastName;
		this.sex = sex;
		this.age = age;
		System.out.println(lastName + " " + firstName + " created ");
	
	}
	
	
}
