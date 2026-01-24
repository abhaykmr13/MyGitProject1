//Given a binary string S. The task is to count the number of substrings that starts and end with 1.
//Note: The starting and the ending 1s should be different.
public class CountSubString {
	int countSubstr (String S)
    {
        // your code here 
        int res,j=0;  // Initialize result 
         char str[]=S.toCharArray();
         int n=S.length();
        // Pick a starting point 
        for (int i = 0; i<n; i++)  
        { 
            if (str[i] == '1')  
            { 
                j++;
                
                
                } 
            }
            res=j*(j-1)/2;
        
        return res;
        }
	public static void main(String[] args) {
		String s="10101";
//		The 3 substrings are "101",
//		"10101" and "101".
		
		
		CountSubString c=new  CountSubString();
		//c.countSubstr(s);
		System.out.println(c.countSubstr(s));
		
	}

}
