
public class LargestArrayElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 44, 5, 75, 8,99 };
		int m = arr[0];
		int seclar=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>m) {
				seclar=m;
				m=arr[i];
			}
			
			else if(arr[i]>seclar) {
				
				seclar=arr[i];
				
			}
			

		}
		System.out.println(m);
		System.out.println(seclar);
	}

}
