
public class FirstCharacter {
	public static void main(String[] args) {
		String S = "geeks for geeks";

		StringBuilder str = new StringBuilder();
		str.append(S.charAt(0));
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) ==' ') {
				str.append(S.charAt(i + 1));
			}

		}

		System.out.println(str.toString());

	}
}
