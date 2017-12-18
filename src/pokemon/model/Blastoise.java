package pokemon.model;

public class Blastoise extends Pokemon implements Water
{

	public Blastoise(int number, String name)
	{
		super(number, name);
	}

	public int waterShuriken(int amount)
	{
		int shuriken = (int)(Math.random()*4)+2;
		
		return shuriken;
	}
	
	public String waterPulse()
	{
		return "The oppenent is now confused.";
	}
	
	public void hydroPump()
	{
		System.out.println("The target is blasted by a huge volume of water launched under great pressure.");
	}
}
