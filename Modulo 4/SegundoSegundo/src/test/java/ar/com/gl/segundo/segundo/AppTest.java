package ar.com.gl.segundo.segundo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static PlatoDao dao;
    static Plato plato1 = new Plato("Milanesa Clasica", "una delicada milanesa con crocantes papas fritas finamente seleccionadas", 500);
	static Plato plato2 = new Plato("Lomo a la Piedra", "un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el\r\n" + 
			"lomo junto a especias orientales y sudamericanas logrando un elixir entre la textura y el sabor.", 750);
    @BeforeAll
    public static void setup()
    {
    	dao = new PlatoDao();
		dao.createPlato(plato1);
		dao.createPlato(plato2);
    }
    
    @Test
    public void createPlatoTest ()
    {
        Plato platoNuevo = new Plato("Plato Nuevo", "Description nueva", 500);
        
        dao.createPlato(platoNuevo);
        
        Plato daoResponse = dao.getPlatos(platoNuevo.getId()).get(0);
        
       
        assertNotNull(daoResponse);
        assertEquals(platoNuevo.getDescription(), daoResponse.getDescription());
        assertEquals(platoNuevo.getId(), daoResponse.getId());
        assertEquals(platoNuevo.getNombre(), daoResponse.getNombre());
        assertEquals(platoNuevo.getPrecio(), daoResponse.getPrecio());

    }
    
    @Test
    public void getTodosLosPlatosTest()
    {
    	List<Plato> lista = new ArrayList<Plato>();
    	
    	lista.add(plato1);
    	lista.add(plato2);
    	
    	List<Plato> daoResponse = dao.getPlatos();
    	
    	assertTrue(daoResponse.size() == lista.size());
    	for(int i = 0; i < lista.size(); i++)
    	{
    		assertNotNull(daoResponse);
    		assertEquals(lista.get(i).getDescription(), daoResponse.get(i).getDescription());
    		assertEquals(lista.get(i).getNombre(), daoResponse.get(i).getNombre());
    		assertEquals(lista.get(i).getId(), daoResponse.get(i).getId());
    		assertEquals(lista.get(i).getPrecio(), daoResponse.get(i).getPrecio());
    	}
    	
    }

    @Test
    public void getPlatoPorId()
    {
    	Plato plato = dao.getPlatos(plato1.getId()).get(0);
    	
    	assertNotNull(plato);
    	assertEquals(plato1.getNombre(), plato.getNombre());
    	assertEquals(plato1.getDescription(), plato.getDescription());
    	assertEquals(plato1.getPrecio(), plato.getPrecio());
    	assertEquals(plato1.getId(), plato.getId());
    }
    
    @Test
    public void updatePlato()
    {
    	Plato platoModificado = plato1;
    	platoModificado.setNombre("Nombre modificado");
    	platoModificado.setDescription("Desc Modificada");
    	platoModificado.setPrecio(100);
    	
    	dao.updatePlato(platoModificado);
    	
    	Plato daoResponse = dao.getPlatos(platoModificado.getId()).get(0);
    	
    	assertNotNull(daoResponse);
    	assertEquals(platoModificado.getId(), daoResponse.getId());
    	assertEquals(platoModificado.getNombre(), daoResponse.getNombre());
    	assertEquals(platoModificado.getDescription(), daoResponse.getDescription());
    	assertEquals(platoModificado.getPrecio(), daoResponse.getPrecio());
    }
    
    @Test
    public void deletePlato()
    {
    	dao.removePlato(plato2);
    	
    	List<Plato> daoResponse = dao.getPlatos(plato2.getId());
    	
    	assertTrue(daoResponse.isEmpty());
    }
}
