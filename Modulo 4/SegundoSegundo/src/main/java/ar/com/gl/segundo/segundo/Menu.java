package ar.com.gl.segundo.segundo;



public class Menu {
	
	public static void main(String[] args)
	{
		PlatoDao dao = new PlatoDao();
		
		dao.createPlato(new Plato("Milanesa Clasica", "una delicada milanesa con crocantes papas fritas finamente seleccionadas", 500));
		dao.createPlato(new Plato("Lomo a la Piedra", "un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el\r\n" + 
				"lomo junto a especias orientales y sudamericanas logrando un elixir entre la textura y el sabor.", 750));
		
		for (Plato plato : dao.getPlatos())
		{
			System.out.println("Plato: \n");
			System.out.println(plato.toString());
		}
		
	}
	
	
}
