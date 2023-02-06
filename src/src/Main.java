package src;
import java.util.*;
public class Main {
	public static void main(String[] args) {
	
		Cat cat =new Cat();
		Horse horse =new Horse();
		Bird bird =new Bird();
		Dog dog =new Dog();
		RobbotPet robbot =new RobbotPet();
		
		ArrayList<String> Pet = new ArrayList<>();
		ArrayList<String> petShow = new ArrayList<>();
		
		
		Pet.add("Cat");
		cat.setname("cat");
		System.out.println(cat.getname() + " Information");
		System.out.println("The name of Pet : "+ cat.getname());
		System.out.println("The sound of Pet :"); cat.Sound();
		cat.eat();
	    cat.move();
		System.out.println("_________________________________");
		
		Pet.add("Horse");
		horse.setname("horse");
		System.out.println(horse.getname() + " Information");	
		System.out.println("The name of Pet : "+ horse.getname());
		System.out.print("The sound of Pet :"); horse.Sound();
	    horse.eat();
	    horse.move();
		System.out.println("_________________________________");
		
		Pet.add("Bird");
		bird.setname("Bird");
		System.out.println(bird.getname() + " Information");
		System.out.println("The name of Pet : "+ bird.getname());
		System.out.println("The sound of Pet :"); bird.Sound();
		bird.eat();
		bird.move();
		System.out.println("_________________________________");
		
		Pet.add("RobborPet");
		robbot.setname("RobbotPet");
		System.out.println(robbot.getname() + " Information");
		System.out.println("The name of Pet : "+ robbot.getname());
		System.out.println("The sound of Pet :"); robbot.Sound();
		robbot.eat();
		robbot.move();
		System.out.println("_________________________________");
		
		
		Pet.add("Dog");
		dog.setname("Dog");
		System.out.println(dog.getname() + " Information");	
		System.out.println("The name of Pet : "+ dog.getname());
		System.out.println("The sound of Pet :"); dog.Sound();
	    dog.eat();
	    dog.move();
		System.out.println("_________________________________");
	}
}
