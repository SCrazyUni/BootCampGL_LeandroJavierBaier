/**
 * 
 */
package mockito.example.services;



import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.services.exceptions.ZeroDivisionException;
import mockito.example.services.impl.BasicOperationsServiceImpl;
import mockito.example.services.impl.CalculatorServiceImpl;
import mockito.example.services.impl.DataServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

	private  CalculatorServiceImpl calculator = new CalculatorServiceImpl();
	
	@Mock
	private  BasicOperationsService mockOperationService;
	@Mock
	private  DataService mockDataService;

	@BeforeEach
	void setup()
	{
		mockOperationService = Mockito.mock(BasicOperationsService.class, Mockito.CALLS_REAL_METHODS);
		mockDataService = Mockito.mock(DataService.class, Mockito.CALLS_REAL_METHODS);
		calculator.setBasicOperationsService(mockOperationService);
		calculator.setDataService(mockDataService);
	}
	

	@Test
	@DisplayName("Test add")
	void basicOperationsServiceAddTest()
	{
		int input1 = 20, input2 = 30;
		Mockito.when(mockOperationService.add(input1, input2)).thenReturn((double)(input1 + input2));
		double[] input = {calculator.calculateSum(input1, input2)};
		double[] expected = {input1 + input2};
		assertArrayEquals(input, expected, 0);
	}

	@Test
	@DisplayName("Test substract")
	void basicOperationServiceSubstracTest()
	{	
		int input1 = 30, input2 = 5;
		Mockito.when(mockOperationService.subtract(input1, input2)).thenReturn((double)(input1 - input2));
		double[] input = {calculator.calculateSubstraction(input1, input2)};
		double[] expected = {input1 - input2};
		assertArrayEquals(input, expected, 0);
	}
	

	@Test
	@DisplayName("Test multiply")
	void basicOperationServiceMultiplyTest()
	{
		int input1 = 30, input2 = 5;
		Mockito.when(mockOperationService.multiply(input1, input2)).thenReturn((double)(input1 * input2));
		double[] input = {calculator.calculateMultiplication(input1, input2)};
		double[] expected = {input1 * input2};
		assertArrayEquals(input, expected, 0);
	}
	

	@Test
	@DisplayName("Test divide")
	void basicOperationServiceDivideTest()
	{
		int input1 = 30, input2 = 5;
		Mockito.when(mockOperationService.divide(input1, input2)).thenReturn((double)(input1 / input2));
		double[] input = new double[1];
		try 
		{
			input[0] = calculator.calculateDivision(input1, input2);
			
		}
		catch (ZeroDivisionException e){
			// TODO Auto-generated catch block
		e.printStackTrace();}
		double[] expected = {input1 / input2};
		assertArrayEquals(expected, input, 0);
	
	}
	
	
	@Test
	@DisplayName("Test DataService promedio")
	void dataServiceListPromedioTest()
	{
		int[] listaNumeros = {1,2,3,4,5};
		Mockito.when(mockDataService.getListOfNumbers()).thenReturn(listaNumeros);
		
		double promedio = 0;
		for(int numero : listaNumeros)
		{
			promedio += numero;
		}
		promedio = promedio / listaNumeros.length;
		
		double[] expected = {promedio};
		double[] input = {calculator.calculateAverage()};
		assertArrayEquals(expected, input, 0);
		
	}
	
	@Test
	@DisplayName("Test DataService null")
	void dataServiceListNullTest()
	{
		
		Mockito.when(mockDataService.getListOfNumbers()).thenReturn(null);
		assertThrows(NullPointerException.class, () ->{ calculator.calculateAverage();});
		
	}
	
	@Test
	@DisplayName("Test division por 0")
	void calculatorDivisionPorCero()
	{
		assertThrows(ZeroDivisionException.class, () -> {calculator.calculateDivision(5, 0);
														 System.out.println("Esto se imprime si se ejecuto la funcion");
		});
		
	}
	
	
	@Test
	@DisplayName("Test de printResult")
	void calculatorPrintResultTest()
	{
		int num1 = 0, num2 = 5;
		String result = "El resultado es: ";
		String[] expected = {result + calculator.calculateSum(num1, num2)};
		String[] actual = {calculator.printResult(calculator.calculateSum(num1, num2))};
		
		assertArrayEquals(expected, actual);
	}
	
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,5})
	void parametrizadoTest(int numero)
	{
		assertTrue(calculator.isEven(numero));
	}
	
	@Spy
	BasicOperationsServiceImpl operationImpl = new BasicOperationsServiceImpl();
	@Test
	void spyTest()
	{
		double[] expected = {5};
		double[] input = new double[1];
		input[0] = operationImpl.add(5, 0);
		Mockito.verify(operationImpl).add(5, 0);
		
		
		assertArrayEquals(input, expected,0);
		
	}
	
	@Mock
	DataServiceImpl mockDataServiceImpl = new DataServiceImpl();
	
	@Test
	void dataSourceImplListTest()
	{
		int[] listaMockReturn = {1,2,3,4,5};
		int[] listaInput = {1,2,3,4,5,6,7,8,9};
		Mockito.when(mockDataServiceImpl.getListOfNumbers()).thenReturn(listaMockReturn);
		mockDataServiceImpl.setListOfNumbers(listaInput);
		
		assertNotEquals(listaInput.length, mockDataServiceImpl.getListOfNumbers().length);
	}
	
}
