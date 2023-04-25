package ch06.sec00;

import java.util.Scanner;

public class JavaJinsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 : ");
		int x = Integer.parseInt(scanner.next());
		scanner.close();
		
		System.out.printf("10진수는 : "+ x);
		System.out.printf("2진수는 : " + Integer.toBinaryString(x));
		System.out.printf("8진수는 : " + Integer.toOctalString(x));
		System.out.printf("16진수는 : "+ Integer.toHexString(x));
	}

}
