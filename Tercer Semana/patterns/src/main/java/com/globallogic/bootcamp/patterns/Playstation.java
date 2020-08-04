package com.globallogic.bootcamp.patterns;

public class Playstation {

	
	public static void main(String[] args)
	{
		Game videogame1 = new Game("Resident Evil");
		Game videogame2 = new Game("Brawlhalla");
		Game videogame3 = null;
		
		Playstation playstation = new Playstation(videogame1);
		playstation.askMyGame();
		
		playstation.setGame(videogame2);
		playstation.askMyGame();
		
		playstation.setGame(videogame3);
		playstation.askMyGame();
	}
	
	
	private Game videogame;
	
	public Playstation(Game videogame)
	{
		this.videogame = videogame;
	}
	
	public void setGame(Game videogame)
	{
		this.videogame = videogame;
	}
	
	public void askMyGame()
	{
		if (videogame == null || videogame.getTitle().isEmpty())
		{
			System.out.println("Estoy Vacio!!");
		}
		else
		{
			System.out.println("El videojuego que estoy corriendo es: " + videogame.getTitle());
		}
	}
}
