package mockito.example.services.impl;

import mockito.example.services.DataService;

public class DataServiceImpl implements DataService{

	private int[] listOfNumbers = new int[20];
	
	public DataServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int[] getListOfNumbers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setListOfNumbers(int[] lista)
	{
		if (lista.length <= listOfNumbers.length)
		{
			for(int i = 0; i < lista.length; i++)
			{
				listOfNumbers[i] = lista[i];
			}
		}
	}

}
