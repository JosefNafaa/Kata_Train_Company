package com.example.kataBnp.city;

import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		/*
		 * Instant instant = Instant.ofEpochSecond(1572242400); Date date =
		 * Date.from(instant); System.out.println(date);
		 */
		City city = new City();
		List<Station> stations = new ArrayList<Station>();

		// * System.out.println(city.getZones().get(0).getStations().get(0).getName());
		/*
		System.out.println("stations of Zone 1:");
		stations = city.getZones().get(0).getStations();
		for (Station s : stations) {
			// * System.out.println(s.getId());
			System.out.println(s.getName());
		}
		System.out.println("stations of Zone 2:");
		stations = city.getZones().get(1).getStations();
		for (Station s : stations) {
			// * System.out.println(s.getId());
			System.out.println(s.getName());
		}
		System.out.println("stations of Zone 3:");
		stations = city.getZones().get(2).getStations();
		for (Station s : stations) {
			// * System.out.println(s.getId());
			System.out.println(s.getName());
		}
		System.out.println("stations of Zone 4:");
		stations = city.getZones().get(3).getStations();
		for (Station s : stations) {
			// * System.out.println(s.getId());
			System.out.println(s.getName());
		}
		*/
		// System.out.println(city.zonesOfStation("C"));
		
		System.out.println(TravelPrice.cheap("A", "D"));

	}
}