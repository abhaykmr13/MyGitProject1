
class Course1 implements Cloneable {
	String subject1;

	String subject2;

	String subject3;

	public Course1(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;

		this.subject2 = sub2;

		this.subject3 = sub3;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Student3 implements Cloneable {
	int id;

	String name;

	Course1 course;

	public Student3(int id, String name, Course1 course) {
		this.id = id;

		this.name = name;

		this.course = course;
	}

	// Overriding clone() method to create a deep copy of an object.

	protected Object clone() throws CloneNotSupportedException {
		Student3 student = (Student3) super.clone();

		student.course = (Course1) course.clone();

		return student;
	}
}

public class DeepCopyInJava {
	public static void main(String[] args) {
		Course1 science = new Course1("Physics", "Chemistry", "Biology");

		Student3 s1 = new Student3(111, "John", science);

		Student3 s2 = null;

		try {
			// Creating a clone of s1 and assigning it to s2

			s2 = (Student3) s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Printing the subject3 of 's1'

		System.out.println(s1.course.subject3); // Output : Biology

		// Changing the subject3 of 's2'

		s2.course.subject3 = "Maths";

		// This change will not be reflected in original student 's1'

		System.out.println(s1.course.subject3); // Output : Biology
	}
}