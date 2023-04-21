package ch04.sec99;

import java.util.Scanner;


public class MaxGongAykSu {
	
	static int GongAyk (int a, int b, int c) {
		int min = 0;
		
		if(a > b) {
			if(b > c) {
				min = c;
			}
			else {
				min = b;
			}
		} else {
			if(a>c) {
				min = c;
			} else {
				min = a;
			}
		}
		for (int i = min; i >0; i--) {
			if(a % i ==0 && b % i == 0 && c % i == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("3개의 정수를 입력하세요 : ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		System.out.println("최대 공약수 :" + GongAyk(a,b,c));

	}
	

}
