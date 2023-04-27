package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {

		Driver x = new Driver();
		
		Vehicle v = new Vehicle();
		x.drive(v);
		
		Bus bus = new Bus();
		x.drive(bus);
		
		Taxi taxi = new Taxi();
		x.drive(taxi);
	}

}
