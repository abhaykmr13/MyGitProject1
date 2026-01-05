import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//A Java program to demonstrate Comparator interface
class Student7 {
	int rollno;
	String name;
	int age;

	Student7(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student7 s1 = (Student7) o1;
		Student7 s2 = (Student7) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student7 s1 = (Student7) o1;
		Student7 s2 = (Student7) o2;

		return s1.name.compareTo(s2.name);
	}
}

// Driver class
class Comparator1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Student7(101, "Vijay", 23));
		al.add(new Student7(106, "Ajay", 27));
		al.add(new Student7(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student7 st = (Student7) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		
		

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student7 st = (Student7) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
