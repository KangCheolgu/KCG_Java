package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		
//		Phone p = new Phone();
		SmartPhone sp = new SmartPhone("홍길동");
		
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();

	}

}
