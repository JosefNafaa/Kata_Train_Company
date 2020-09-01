package com.example.kataBnp.city;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.example.kataBnp.journey.Travel;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public final class TravelPrice {

	static City c = new City();

	/**
	 * 
	 * @return une map des zones de depart et arrivé avec le prix du trajet
	 */
	public static Table<Integer, Integer, Double> getPrice() {
		Table<Integer, Integer, Double> tableTrips = HashBasedTable.create();
		tableTrips.put(1, 1, 2.40);
		tableTrips.put(2, 2, 2.40);
		tableTrips.put(1, 2, 2.40);
		tableTrips.put(2, 1, 2.40);
		tableTrips.put(3, 3, 2.00);
		tableTrips.put(4, 4, 2.00);
		tableTrips.put(3, 4, 2.00);
		tableTrips.put(4, 3, 2.00);
		tableTrips.put(3, 1, 2.80);
		tableTrips.put(3, 2, 2.80);
		tableTrips.put(4, 1, 3.00);
		tableTrips.put(4, 2, 3.00);
		tableTrips.put(1, 3, 2.80);
		tableTrips.put(2, 3, 2.80);
		tableTrips.put(1, 4, 3.00);
		tableTrips.put(2, 4, 3.00);

		return tableTrips;

	}

	/**
	 * 
	 * @param zoneDépart
	 * @param ZoneArrivée
	 * @return le prix le moins cher
	 */

	public static Travel cheap(String stationFrom, String stationTo) {

		ArrayList<Travel> travels = new ArrayList<>();
		ArrayList<Integer> zonesStationFrom = c.zonesOfStation(stationFrom);

		ArrayList<Integer> zonesStationTo = c.zonesOfStation(stationTo);

		for (int i = 0; i < zonesStationFrom.size(); i++) {
			for (int j = 0; j < zonesStationTo.size(); j++) {
				Travel tr = new Travel();
				tr.setZoneFrom(zonesStationFrom.get(i));
				tr.setZoneTo(zonesStationTo.get(j));
				tr.setStationFrom(stationFrom);
				tr.setStationTo(stationTo);
				tr.setPrice(getPrice().get(tr.getZoneFrom(), tr.getZoneTo()));
				travels.add(tr);
			}

		}
		
		Collections.sort(travels, new Comparator<Travel>() {
		    @Override
		    public int compare(Travel t1, Travel t2) {
		        return Double.compare(t1.getPrice(), t2.getPrice());
		    }
		});
		

		
		return travels.get(0);
	}

}
