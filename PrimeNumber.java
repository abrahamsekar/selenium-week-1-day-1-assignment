package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int gnNumber = 13;
		boolean flag = false;
		for (int i = 2; i < gnNumber; i++) {
			if(gnNumber%2==0) {
				flag = true;
				break;
			}
			
		}
		if(flag == false)
		{
			System.out.println("given number is prime number");
		}
		else {
			System.out.println("Given number is non prime number");
		}
	}

}
