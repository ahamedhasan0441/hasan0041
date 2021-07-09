package knightingaleday5;

public class contionaldemo {
	public class ConditionDemo {
		public static void main(String[] args) {
			int i=500;
			
			if(i==200) {
				System.out.println("i is euqal to 200.................");
			}
			else {
				System.out.println("i is not euqal to 200..............");
			}
			// ? - ternary operator
			System.out.println((i==100)?"i is equal to 100":"i is not equal to 100...");
			
			System.out.println((i%2==0)?"Even Number....":"Odd Number.....");
			
			
			if(i==200) {
				System.out.println("i value is 200");
			}
			else if(i<200) {
				System.out.println("i value is lesser than 200");
			}
			else if(i>400) {
				System.out.println("i value is greater than 400");
			}
			else {
				System.out.println("none of the conditions satisfied...");
			}
			
		}
	}
	







}
