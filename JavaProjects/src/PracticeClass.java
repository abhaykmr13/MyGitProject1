import java.text.DecimalFormat;

class PracticeClass{
	
	public static void main(String[] args) {
		
		
        double d = 4.2435;
//		
//		// BigDecimal bd = new BigDecimal(d - Math.floor(d));
//		// bd = bd.setScale(4, RoundingMode.HALF_DOWN);
//		// System.out.println(bd.toString());
//		String number = String.valueOf(d);
//
//		number = number.substring(number.indexOf(".")).substring(1);
//		
//		
//		String s = "";
//		s = s.concat("(".concat(number).concat(")"));
//		System.out.println(s);
		
		
//	
		
//		double num = 540.512;
//				double sum = 1978.8;
//				
//				String str = String.format("%.1f", (num/sum) * 100.0); 
//				System.out.println(str);
        
        String string_temp = new Double(d).toString();
        String string_form = string_temp.substring(0,string_temp.indexOf('.'));
        double t = Double.valueOf(string_form);
        int IntValue = (int) Math. round(t);
        System.out.println(IntValue);
        String s1=String.valueOf(IntValue);
        
        String number = String.valueOf(d);
        
        		number = number.substring(number.indexOf(".")).substring(1);
        		
        		
        		String s = "";
        		String ans2="";
        		s = s.concat("(".concat(number).concat(")"));
        		
        		ans2=s1.concat(".").concat(s);
        		
        		System.out.println(ans2);
        
        
        
		
		
	}
	
	
}