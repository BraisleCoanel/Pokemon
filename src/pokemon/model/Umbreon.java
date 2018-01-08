package pokemon.model;

public class Umbreon extends Eevee implements Dark
{
	public Umbreon()
	{
		super(197, "Umbreon");
		setup();
	}
	
	public Umbreon(String name)
	{
		super(197, name);
		setup();
	}

	public Umbreon(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(65);
		this.setCanEvolve(false);
		this.setHealthPoints(95);
		this.setEnhancmentModifier(.05);
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
