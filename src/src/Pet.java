package src;

public class Pet {

	String name;
	
	//***********setter & getter******************
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	
	
	
	void Sound(){
		System.out.println("Pet is Has Sound");
		
	}
	
	
	
	void move() {
		System.out.println("Pet is moving");
	} 
	
	
	void eat() {
		
		System.out.println("Pet is Eating");
		
	}
	
	
}
