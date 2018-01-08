package pokemon.model;

public class Darkrai extends Pokemon implements Dark
{
	public Darkrai()
	{
		super(491, "Darkrai");
		setup();	
	}
	
	public Darkrai(String name)
	{
		super(491, name);
		setup();
	}

	public Darkrai(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(90);
		this.setCanEvolve(false);
		this.setEnhancmentModifier(.05);
		this.setHealthPoints(70);
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
