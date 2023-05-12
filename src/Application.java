
public class Application {

	public static void main(String[] args) {
		
		Cat a1 = new Cat();
		a1.setName("Cat");
		a1.setLegs(4);
		a1.setType("Mammal");
		
		Dog a2 = new Dog();
		a2.setName("Dog");
		a2.setLegs(4);
		a2.setType("Mammal");
		
		Snake a3 = new Snake();
		a3.setName("Snake");
		a3.setLegs(0);
		a3.setType("Reptiel");
		
		a1.makeSound();
		a2.makeSound();
		a3.makeSound();
	}

}
