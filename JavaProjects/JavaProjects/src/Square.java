import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base");
		int b = sc.nextInt();
		System.out.println("Enter the Power");
		int p = sc.nextInt();
		int i = 1;
		for (int j = 1; j <= p; j++) {

			i = i * b;
		}
		System.out.println(i);

		sc.close();

	}

}
