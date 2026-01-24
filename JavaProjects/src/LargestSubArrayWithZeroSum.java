
import java.util.HashMap;

//A Java program to find a peak element 

class LargestSubArrayWithZeroSum {

	static int maxiLen(int[] arr) {

		int n = arr.length;
		int sum = 0;
		int maxi = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //key=prefix sum
		//value is the index
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum == 0) {
				maxi = i + 1;
			} else {
				if (map.get(sum) != null) {
					maxi = Math.max(maxi, i - map.get(sum));
				} else {
					map.put(sum, i);
				}
			}

		}

		return maxi;

	}

	public static void main(String[] args) {

		int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };

		System.out.println(maxiLen(arr));

	}

}