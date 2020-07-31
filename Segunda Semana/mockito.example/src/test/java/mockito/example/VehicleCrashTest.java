package mockito.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class VehicleCrashTest {

	@Test
	void WhenNoCrashNoValueThenOk() {
		VehicleCrash crashTest = new VehicleCrash();
		
		assertEquals(0, crashTest.getTotalEnergy());
		assertEquals(0, crashTest.getTotalVehicles());
		assertEquals("No crashes measured",crashTest.toString());
	}

	@Test
	void WhenCrashAndCorrectValueThenOk() {
		fail("Not yet implemented");
	}

}
