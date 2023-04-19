package ch04.sec99;

public class UserfuctionCal {

	public static void main(String[] args) {

		int result = calculate(4, 2, '*');

		System.out.println(result);
	}

	static int calculate(int a, int b, char c) {

		int answer;

		if ('+'== c) {
			answer = a + b;
			System.out.print(a + " + " + b + " = " );
			return answer;
		} else if ('-'== c) {
			answer = a - b;
			System.out.print(a + " - " + b + " = ");
			return answer;
		} else if ('*'== c) {
			answer = a * b;
			System.out.print(a + " * " + b + " = ");
			return answer;
		} else {
			answer = a / b;
			System.out.print(a + " / " + b + " = ");
			return answer;
		}

	}

	static int calculateCase(int a, int b, char c) {

		int answer;
		switch (c) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		default:
			return 0;
		}
	}

}
