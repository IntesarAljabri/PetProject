package src;

public class Bird extends Pet{
	
	
	@Override
	void Sound(){
		System.out.println("Singing");
	}

	
	@Override
	void move() {
		System.out.println("Bird is eating seeds");
	} 
	
	
	@Override
	void eat() {
		
		System.out.println("Bird is Fly");
		
	}

}
