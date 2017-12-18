package pokemon.model;

public class Bibarel extends Pokemon implements Water, Normal
{

	public Bibarel(int number, String name)
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
	
	public void tackle()
	{
		System.out.println("A physical attack in which the user charges and slams ibto the target with its whole body.");
	}
	
	public void doubleEdge()
	{
		System.out.println("A reckless, life risking tackle. This also damages the user quite a lot.");
	}
	
	public void lastResort()
	{
		System.out.println("This move can be ud only after the user has used all the other moves it knows in the battle.");
	}
}
