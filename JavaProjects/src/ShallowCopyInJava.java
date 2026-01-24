
class Course {
	String subject1;

	String subject2;

	String subject3;

	public Course(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;

		this.subject2 = sub2;

		this.subject3 = sub3;
	}
}

class Student1 implements Cloneable {
	int id;

	String name;

	Course course;

	public Student1(int id, String name, Course course) {
		this.id = id;

		this.name = name;

		this.course = course;
	}

	// Default version of clone() method. It creates shallow copy of an object.

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCopyInJava {
	public static void main(String[] args) {
		Course science = new Course("Physics", "Chemistry", "Biology");

		Student1 s1 = new Student1(111, "John", science);

		Student1 s2 = null;

		try {
			// Creating a clone of s1 and assigning it to s2

			s2 = (Student1) s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Printing the subject3 of 'student1'

		System.out.println("Original Subject3 ="+s1.course.subject3); // Output : Biology

		// Changing the subject3 of 'student2'

		s2.course.subject3 = "Maths";

		// This change will be reflected in original student 'student1'

		System.out.println("chaged Subject3  = "+s1.course.subject3); // Output : Maths

	}
}


//In the above example, ‘s1‘ is an object of ‘Student‘ class which has three fields – id, name and course.
//‘course‘ is a reference variable pointing to a ‘Course‘ type object. 
//Clone of ‘s1‘ is created by calling clone method on it and assigned it to ‘s2‘.
//As default version of clone method creates the shallow copy, the ‘course‘ field of both ‘s1‘ 
//and ‘s2‘ will be pointing to same ‘Course‘ object.
//So, any changes made to this object through ‘s2‘ will be reflected in ‘s1‘ or vice-versa.













