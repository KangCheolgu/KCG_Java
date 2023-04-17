package ch03.sec11;

import java.util.Scanner;

public class MultiSelect {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("점수 값 입력 :");
			String stScore = scanner.nextLine();
			
			if(stScore.equals("q"))
				break;
			
			int score = Integer.parseInt(stScore);			
			char grade;
				
			if( score >= 90 )
				grade = 'A';
			else if (score >= 80)
				grade = 'B';
			else if (score >= 70)
				grade = 'C';
			else if (score >= 60)
				grade = 'D';
			else
				grade = 'F';
				
			System.out.println( score + "점은 " +grade+ "등급입니다.");

		}
		
		System.out.println("종료");
		
	}

}
