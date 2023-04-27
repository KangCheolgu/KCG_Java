package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;
		
		rc = new TV();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();	
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		
	}

}
