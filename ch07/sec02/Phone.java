package ch07.sec02;

public class Phone {

	public String model;
	public String color;
	
	

	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("phone(model, color) 생성자 실행");
	}

	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	public void sendVoice(String messange) {
		System.out.println("자기 : " + messange);
	}

	public void receiveVoice(String messange) {
		System.out.println("상대방 : " + messange);
	}

	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
