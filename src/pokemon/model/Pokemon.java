package pokemon.model;

import java.util.ArrayList;

public abstract class Pokemon
{
	private int healthPoints;
	private int attackPoints;
	private double enhancmentModifier;
	private int number;
	private String name;
	private boolean canEvolve;
	
	public Pokemon (int number, String name)
	{
		this.name = name;
		this.number = number;
	}
	
	public String[] getPokemonTypes()
	{
		String [] types = null;
		ArrayList<String> parentType = new ArrayList<String>();
		Class<?> currentClass = this.getClass();
		
		while(currentClass.getSuperclass() != null)
		{
			Class<?> [] pokemonTypes = currentClass.getInterfaces();
			types = new String[pokemonTypes.length];
			
			for(int index = 0; index < types.length; index++)
			{
				String currentInterface = pokemonTypes[index].getCanonicalName();
				currentInterface = currentInterface.replace(this.getClass().getName() + ".", "");
				if(!parentType.contains(currentInterface))
				{
					parentType.add(currentInterface);
				}
			}
			currentClass = currentClass.getSuperclass();
		}
		
		types = new String [parentType.size()];
		
		for(int index = 0; index < parentType.size(); index++)
		{
			types[index] = parentType.get(index);
		}
		
		return types;
	}
	
	/**
	 * @return the healthPoints
	 */
	public int getHealthPoints()
	{
		return healthPoints;
	}

	/**
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}

	/**
	 * @return the attackPoints
	 */
	public int getAttackPoints()
	{
		return attackPoints;
	}

	/**
	 * @param attackPoints the attackPoints to set
	 */
	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}

	/**
	 * @return the enhancmentModifier
	 */
	public double getEnhancmentModifier()
	{
		return enhancmentModifier;
	}

	/**
	 * @param enhancmentModifier the enhancmentModifier to set
	 */
	public void setEnhancmentModifier(double enhancmentModifier)
	{
		this.enhancmentModifier = enhancmentModifier;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the canEvolve
	 */
	public boolean isCanEvolve()
	{
		return canEvolve;
	}

	/**
	 * @param canEvolve the canEvolve to set
	 */
	public void setCanEvolve(boolean canEvolve)
	{
		this.canEvolve = canEvolve;
	}

	/**
	 * @return the number
	 */
	public int getNumber()
	{
		return number;
	}

	public String toString()
	{
		String description = "Hi, I'm a " + name + ", and my HP is " + healthPoints;
		
		return description;
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}
}
