package com.example.kataBnp.cityTest;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.example.kataBnp.city.City;

public class CityTest {

	@Test()
	public void getZonesOfStation() {
		City city = new City();
		ArrayList<Integer> zonesExpected = new ArrayList<Integer>();
		ArrayList<Integer> zonesActual = city.zonesOfStation("C");
		zonesExpected.add(2);
		zonesExpected.add(3);
		assertArrayEquals(zonesExpected.toArray(), zonesActual.toArray());

	}
}
