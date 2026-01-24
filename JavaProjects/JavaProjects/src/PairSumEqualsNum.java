
public class PairSumEqualsNum {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, -3, 9, -4, 5, 4, 8 };
		int num = 5;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i] + arr[j] == num) {
					System.out.println(
							"The pairs are " + arr[i] + " and " + arr[j] + " and location are " + i + " and " + j);
					break;

				}

			}

		}

	}

}
