package week1.day1.Assignments;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 639;
		int sum = 0;
		int remainder;
		
		while ( input > 0 )  {
			
		remainder = input % 10;
		sum = sum + remainder;
		input = input/10;
		}
		System.out.println("sum of given value is  " + sum );
	}

}
