package src;

public class Dog extends Pet{

	

	@Override
	void Sound(){
		System.out.println("Hoo Hoo");
	}

	
	@Override
	void move() {
		System.out.println("DOg is eating bonds");
	} 
	
	
	@Override
	void eat() {
		
		System.out.println("Dog is Walk");
		
	}
	
}
