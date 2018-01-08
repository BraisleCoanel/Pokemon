package pokemon.model;

public class Blastoise extends Pokemon implements Water
{
	public Blastoise()
	{
		super(9, "Blastoise");
		setup();
	}
	
	public Blastoise(String name)
	{
		super(9, name);
		setup();
	}

	public Blastoise(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(83);
		this.setCanEvolve(false);
		this.setEnhancmentModifier(.05);
		this.setHealthPoints(79);
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
