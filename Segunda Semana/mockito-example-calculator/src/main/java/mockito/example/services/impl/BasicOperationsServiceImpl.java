package mockito.example.services.impl;

import mockito.example.services.BasicOperationsService;

public class BasicOperationsServiceImpl implements BasicOperationsService {

	public BasicOperationsServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double add(double input1, double input2) {
		return input1 + input2;
	}

	@Override
	public double subtract(double input1, double input2) {
		return input1 - input2;
	}

	@Override
	public double multiply(double input1, double input2) {
		
		return input1 * input2;
	}

	@Override
	public double divide(double input1, double input2) {
		if (input2 != 0)
		{
			return input1 / input2;
		}
		return 0;
	}

	
}
