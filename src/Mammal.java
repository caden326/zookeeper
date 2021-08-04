
public class Mammal {
	public String name;
	public int energyLevel;
	
	
	//constructor
	public Mammal(String name) {
		this.name = name;
		this.energyLevel = 100;
	}
	
	//Methods
    public void MammalInfo(){
        String details= String.format("\n Name: %s \n Energy Level: %s", this.name, this.energyLevel);
        
        System.out.println(details);
        
    }
    
    public String showEnergy(){
        String details= String.format("\n Energy Level: %s", this.energyLevel);
        
        return details;
        
    }
	
}
