package ch04.sec02;

import java.util.Scanner;

public class IfToSwitch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int score = 0;
		char grade;
		String stScore = "";

		while (true) {

			System.out.print("점수 값 입력(종료 = q) :");
			stScore = scanner.nextLine();

			if (stScore.equals("q"))
				break;

			score = Integer.parseInt(stScore);

			int caseScore = score / 10;

			switch (caseScore) {
			
				case 10: grade = 'A'; break;
				case 9:	grade = 'A'; break;
				case 8:	grade = 'B'; break;
				case 7:	grade = 'C'; break;
				case 6:	grade = 'D'; break;
				default: grade = 'F';
			}
			System.out.println("당신의 점수는 " + score + "점이고 학점은 " + grade + " 입니다.");

		}
		System.out.println("종료");
	}

}
