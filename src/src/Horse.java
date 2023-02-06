package src;

public class Horse extends Pet{

	

	@Override
	void Sound(){
		System.out.println("Neighing");
	}

	
	@Override
	void move() {
		System.out.println("Horse is eating plant");
	} 
	
	
	@Override
	void eat() {
		
		System.out.println("Horse is run");
		
	}
}
