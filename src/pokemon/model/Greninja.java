package pokemon.model;

public class Greninja extends Pokemon implements Water, Dark
{
	public Greninja(int number, String name)
	{
		super(number, name);
	}
	
	public int waterShuriken(int amount)
	{
		int shuriken = 5;
		
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
	
	public void darkPulse()
	{
		System.out.println("The user releases a horrible aura imbued with dark thoughts.");
	}
	
	public void feintAttack()
	{
		System.out.println("The user approaches the target disarmingly, then throws a sucker punch.");
	}
	
	public String taunt()
	{
		return "The opponent is now enraged.";
	}
}
