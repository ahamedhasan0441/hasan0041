package lab.books;

public class exerisce9swaptwonumbers {
	public static void main(String[] args) {
	 
		float i= 2.31f, j=2.67f;
		
		System.out.println("__before swap__");
		System.out.println("first number="+i);
		System.out.println("second number="+j);
		float temporary=i;
		 i=j;
		 j = temporary;
		
		 System.out.println("after swap");
		 System.out.println("first number is "+i);
		 System.out.println("second number is"+j);
	}

}
