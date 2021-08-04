
public class Gorilla extends Mammal {
	
	
	//constructor
	public Gorilla(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	//methods
	  public int throwSomething(){
		  int sum = this.energyLevel -= 5;
		  
		  return sum; 
	  }
	
	  public int eatBanana(){
		  int sum = this.energyLevel += 10;
		  
		  return sum;
		  
	  }
	
	  
	  public int climb(){
		  int sum = this.energyLevel -= 10;
		  
		  return sum; 
	  }
	  
	  
}
