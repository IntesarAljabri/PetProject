package src;

public class Cat extends Pet {

	

	@Override
	void Sound(){
		System.out.println("Meow Meow");
	}

	
	@Override
	void move() {
		System.out.println("Cat is eating Fish");
	} 
	
	
	@Override
	void eat() {
		
		System.out.println("Cat is Climb");
		
	}
}
