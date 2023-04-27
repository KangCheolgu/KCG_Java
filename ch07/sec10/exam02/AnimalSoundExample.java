package ch07.sec10.exam02;

public class AnimalSoundExample {

	public static void main(String[] args) {
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
