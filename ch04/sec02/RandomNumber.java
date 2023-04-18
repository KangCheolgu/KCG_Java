package ch04.sec02;

public class RandomNumber {

	public static void main(String[] args) {
		
		int num = 0;
		
		num = ((int)(Math.random()*60) + 1);
		
		System.out.println(num);
	}

}
