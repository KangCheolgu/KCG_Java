package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		
		HomeAgency hA = new HomeAgency();
		Home h = hA.rent();
		h.turnOnLight(); 
		
		CarAgency cA = new CarAgency();
		Car c = cA.rent();
		c.run();
		
		
	}

}
