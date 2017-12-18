package pokemon.model;

public class Eevee extends Pokemon implements Normal
{
	public Eevee(int number, String name)
	{
		super(number, name);
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
