package javaprograms;

public class trycatch {
	public static void main(String[] args) {
		 try {
			   	int i = 12/0;
			   	
	}
		 catch(ArithmeticException e) {
			 System.out.println(e.getMessage());
			 System.out.println("Executed Alternate code");
				int i = 12/3;
				System.out.println(i);
			 
		 }
	    try {
	   	String s1 = null;
	   	s1.length();
	   	
	   }
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Executed Alternate code");
			}
			
			 
		 }

}
