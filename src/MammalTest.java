
public class MammalTest {
	public static void main(String[] args) {
		
		
		//constructor----
		Mammal mammal1 = new Mammal("Cow");
		System.out.println(mammal1);
		
//		mammal1.MammalInfo();
		
//		System.out.println(mammal1.showEnergy());
		
		///constructor -----
		Gorilla gorilla1 = new Gorilla ("Harambe");
		System.out.println(gorilla1);
		
		gorilla1.MammalInfo();
		System.out.println(gorilla1.showEnergy());
		
		gorilla1.eatBanana();
		
		gorilla1.throwSomething();
		
		gorilla1.climb();
		
		gorilla1.MammalInfo();
	}
}
