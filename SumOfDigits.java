package week1.day2;

public class SumOfDigits {
public static void main(String[] args) {
	int inputNum = 123;
	int sum = 0;
	while (inputNum>0) {
		int value = inputNum % 10;
		System.out.println(value);
		sum = sum+value;
		System.out.println(sum);
		inputNum = inputNum /2;
		System.out.println(inputNum);
	}
	System.out.println(sum);
}
}
