import java.util.Scanner;

public class PrimeNo {
	public static void main(String args[])
    {
        int num=6, i, count=0;
//        Scanner scan = new Scanner(System.in);
//		
//        System.out.print("Enter a Number : ");
//        num = scan.nextInt();
        boolean status=true;
        for(i=2; i<num; i++)
        {
        	
            if(num%i == 0)
            {
                //count++;
            	status=false;
                break;
            }
        }
        if(status)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }

}
