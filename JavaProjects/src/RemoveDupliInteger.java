
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupliInteger {
	public static void main(String[] args) {
		int a[] = new int[] { 2, 1, 3, 15, 4, 16, 1, 3, 2, 4, 5, 6, 8, 9, 7, 8 };
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.println("Array after removing duplicates");
		System.out.println(set);
	}
}