
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateChar {

	public static void main(String[] args) {

		String str = "abbcdeea";
		char[] c = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (Character c1 : c) {
			if (map.containsKey(c1)) {
				map.put(c1, map.get(c1) + 1);

			} else {
				map.put(c1, 1);
			}

		}

		// Convert the String to char array

		/*
		 * logic: char are inserted as keys and their count as values. If map contains
		 * the char already then increase the value by 1
		 */

		for (Entry<Character, Integer> h : map.entrySet()) {

			if (h.getValue() > 1) {
				System.out.println(h.getKey() + "=" + h.getValue());

			}

		}

	}
}
