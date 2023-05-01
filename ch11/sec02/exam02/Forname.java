package ch11.sec02.exam02;

public class Forname {

	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String1");
			System.out.println("java.lang.String 크래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 크래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
