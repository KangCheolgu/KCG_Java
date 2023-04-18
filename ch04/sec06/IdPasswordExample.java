package ch04.sec06;

import java.util.Scanner;

public class IdPasswordExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String id = "";
		String password = "";
		int count = 0;
		
		
		
		while (count<3) {
			
			System.out.print("id를 입력하세요 : ");
			id = scanner.nextLine();
			
			
			if(! id.equals("ezen")) {
				System.out.println("아이디가 바르지 않습니다."); break;
			}
			System.out.print("비밀번호를 입력하세요 : ");
			
			while (true) {
				
				password = scanner.nextLine();
				
				if (password.equals("12345")) {
					
					System.out.println("접속 완료!"); break;
					
				} else if (count <2) {
					
					System.out.println("비밀번호가 틀렸습니다. 다시 입력하여 주십시오");
					count++;
					
				}
				else {
					System.out.println("비밀번호가 3회 틀렸습니다. Get OUT!"); break;
				}
				
			}
			break;
		}

	}

}
