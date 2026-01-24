
// Classical Java implementation of singleton 
// design pattern 
class Singleton 
{ 
	// private constructor to force use of 
		// getInstance() to create Singleton object 
	private Singleton() {} 
	
	// private static variable
	private static Singleton obj; 

	

	public static synchronized Singleton getInstance() 
	{ 
		if (obj==null) 
			obj = new Singleton(); 
		return obj; 
	} 
} 

