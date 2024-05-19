package fundamentals;

public class Student {

		String firstName, lastName, year, course, section;
		float midtermGrade, finalGrade;
		
		Student ( 
					String firstName, 
					String lastName, 
					String year, 
					String course, 
					String section,
					float midtermGrade,
					float finalGrade
				) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.year = year;
			this.course = course;
			this.section = section;
			this.midtermGrade = midtermGrade;
			this.finalGrade = finalGrade;
			
		}
		
		void introduceSelf () {
			System.out.println("Fullname: " + firstName + " " + lastName );
			System.out.println("Year and Section: " + year + "Year " + course + "-" +  section);
		}
		
		void evaluateGrade() {
			float average =( midtermGrade + finalGrade )/2;
			
			String remark;
			
			if (average > 100) remark = "Invalid Grade";
			else if (average >= 98) remark = "With Highest Honor";
			else if (average >= 95) remark = "With High Honor";
			else if (average >= 90) remark = "With Honor";
			else if (average >= 75) remark = "Passed";
			else remark = "Failed";
			
			System.out.println("Grade: " + average);
			System.out.println("Remark: " + remark);
		}
		
		
}
