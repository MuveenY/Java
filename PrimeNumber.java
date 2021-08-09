package week1.day1.Assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 17;
		boolean flag = false;
		int remainder;
		
		for (int i = 2; i < input/2;  i++) {
			remainder = input % i;
			
			if (remainder == 0  ) {
				flag = true;
				break;
			}
		}
		
		if (flag == false) {
			System.out.println(input + " is a prime number");
		} else {
System.out.println(input + " is not a prime number");
		}

	}

}
