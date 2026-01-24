import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int i=1,fact;
		fact=sc.nextInt();
		
		for(int j=1;j<=fact;j++)
		{
			i=i*j;
			
		}
		System.out.println(i);
		System.out.println("Hello");
		
		sc.close();
		
	}

}
