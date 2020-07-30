package coverage.example;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import coverage.example.model.Galaxy;
import coverage.example.model.Planet;
import coverage.example.model.Star;

class ApplicationTest {

	@Test
	void testMain() {
		Application.main(null);
		Application newApp = new Application();
		crearGalaxy();
	}

	private Galaxy crearGalaxy()
	{
		Galaxy newGalaxy = new Galaxy("Galaxy Nueva");
		Star newStar = new Star();
		ArrayList<Planet> newPlanet = new ArrayList<Planet>();
		
		newStar.setName("Estrella Nueva");
		newPlanet.add(new Planet());
		newPlanet.get(0).setName("Nuevo Planeta");
		newStar.getColor();
		newStar.getName();
		newStar.getPlanets();
		
		newPlanet.get(0).getName();
		
		
		newStar.setPlanets(newPlanet);
		
		newGalaxy.stars.add(newStar);
		
		newGalaxy.toString();
		newStar.toString();
		newPlanet.get(0).toString();
		
		return newGalaxy;
		
	}
}
