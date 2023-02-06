package src;

public class RobbotPet extends Pet {


	@Override
	void Sound(){
		System.out.println("Sagib");
	}

	
	@Override
	void move() {
		System.out.println("Robbot is eating carrot");
	} 
	
	
	@Override
	void eat() {
		
		System.out.println("Robbot is Jumping");
		
	}
}
