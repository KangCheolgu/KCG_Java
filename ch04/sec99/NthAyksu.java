package ch04.sec99;

import java.util.Scanner;

public class NthAyksu {
	
	public static int ayksu(int number, int k) {
		for(int i = 1; i <= number; i ++) {
			if (number % i ==0) {
				k--;
				if(k ==0) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = scanner.nextInt();
		System.out.print("몇 번째 약수입니까? : ");
		int y = scanner.nextInt();
		
		int result = ayksu(x,y);
		if(result == -1) {
			System.out.println("해당 정수의 " + y + " 번째 약수는 없습니다.");
		} else System.out.println(result);
	}

}
