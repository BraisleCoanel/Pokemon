package pokemon.view;

import javax.swing.JFrame;
import pokemon.controller.PokemonController;

public class PokemonFrame extends JFrame
{
	private PokedexPanel pokePanel;
	private PokemonController appController;
	
	public PokemonFrame(PokemonController appController)
	{
		super();
		this.appController = appController;
		this.pokePanel = new PokedexPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Pokedex");
		this.setContentPane(pokePanel);
		this.setResizable(false);
	}
}
