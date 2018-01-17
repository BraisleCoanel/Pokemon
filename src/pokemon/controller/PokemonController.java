package pokemon.controller;

import pokemon.model.*;
import pokemon.view.PokemonFrame;
import java.util.List;
import java.util.ArrayList;

public class PokemonController
{
	private List <Pokemon> pokedex;
	
	private void buildPokedex()
	{
		pokedex.add(new Bibarel());
		pokedex.add(new Blastoise());
		pokedex.add(new Darkrai());
		pokedex.add(new Eevee());
		pokedex.add(new Greninja());
		pokedex.add(new Umbreon());
	}
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		return false;
	}
	
	public boolean isValidDouble(String input)
	{
		return false;
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancmentModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
		
		FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
	}
	
	public void start()
	{

	}

}