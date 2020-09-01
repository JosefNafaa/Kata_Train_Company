package com.example.kataBnp.travelTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.kataBnp.city.TravelPrice;
import com.example.kataBnp.journey.Travel;

public class TravelPriceTest {

	@Test()
	public void getPrice() {
		TravelPrice travelPrice = new TravelPrice();
		double valueExpected = travelPrice.getPrice().get(1, 1);
		double actual = 2.4;
		assertEquals(valueExpected, actual, 0);

	}

	@Test()
	public void getCheapestPrice() {
		TravelPrice travelPrice = new TravelPrice();
		Travel travelActual = new Travel(3, 3, "E", "F", 2.0);
		Travel travelExpected = travelPrice.cheap("E", "F");
		assertEquals(travelExpected.getZoneFrom(), travelActual.getZoneFrom());
		assertEquals(travelExpected.getZoneTo(), travelActual.getZoneTo());
		assertEquals(travelExpected.getPrice(), travelActual.getPrice(),0);
		
        
	}
}
