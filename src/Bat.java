
public class Bat extends Mammal {
	
	
	//constructor
	public Bat(String name) {
		super(name);
		this.energyLevel = 300;
		
		
	}
	
	
	//methods
	public int fly(){
		  int sum = this.energyLevel -= 50;
		  System.out.println("woosshh");
		  return sum; 
	}
	
	public int eatHuman(){
		  int sum = this.energyLevel += 25;
		  
		  return sum; 
	}
	
	public int attackTown(){
		  int sum = this.energyLevel -= 100;
		  System.out.println("Scary chaos Noises");
		  return sum; 
	}	
	
}
