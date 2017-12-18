package pokemon.model;

public class Umbreon extends Eevee implements Dark
{

	public Umbreon(int number, String name)
	{
		super(number, name);
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
