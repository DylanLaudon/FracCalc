package chapter05_section05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class ShippingTester {

	@Test
	//Test CA, USA expect: 5
	public void testContinentalUSA() {
		assertEquals(Shipping.getShippingCost("CA USA"), 5);
	}
	
	@Test
	//Test HI, USA expect: 10
	public void testNonContinentalUSA() {
		assertEquals(Shipping.getShippingCost("HI USA"), 10);
	}
	
	@Test
	//Test BC, CAN expect: 10
	public void testNonUSA() {
		assertEquals(Shipping.getShippingCost("BC CAN"), 10);
	}


}





