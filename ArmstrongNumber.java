package week1.day1.Assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 153;
		int calculated = 0;
		int remainder;
		int original = input;
		 
		 while ( input > 0 ) {
			 remainder = input % 10;
			 input = input / 10;
			 calculated = calculated + (remainder*remainder*remainder);
		 }
		
			 if (calculated == original) {
				System.out.println( calculated + " is armstrong number ");
			} else {
System.out.println(original + " is not an armstrong number ");
			}
		 
		 }
		
		
	}


