package com.example.kataBnp.city;

import java.util.ArrayList;
import java.util.List;

public class City {

	private List<Zone> zones = new ArrayList<>();

	public City() {
		/**
		 * Instatntiation des stations
		 */
		Station A = new Station(1, "A");
		Station B = new Station(2, "B");
		Station C = new Station(3, "C");
		Station D = new Station(4, "D");
		Station E = new Station(5, "E");
		Station F = new Station(6, "F");
		Station G = new Station(7, "G");
		Station H = new Station(8, "H");
		Station I = new Station(9, "I");
		/**
		 * Instantiation des zones
		 */
		List<Station> list1 = new ArrayList<>();
		list1.add(A);
		list1.add(B);
		Zone zone1 = new Zone(1, "1", list1);

		List<Station> list2 = new ArrayList<>();
		list2.add(C);
		list2.add(D);
		list2.add(E);
		Zone zone2 = new Zone(2, "2", list2);

		List<Station> list3 = new ArrayList<>();
		list3.add(C);
		list3.add(E);
		list3.add(F);
		Zone zone3 = new Zone(3, "3", list3);

		List<Station> list4 = new ArrayList<>();
		list4.add(F);
		list4.add(G);
		list4.add(H);
		list4.add(I);
		Zone zone4 = new Zone(4, "4", list4);
		/**
		 * alimentation de la liste des zones
		 */
		this.zones.add(zone1);
		this.zones.add(zone2);
		this.zones.add(zone3);
		this.zones.add(zone4);

	}

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	/**
	 * 
	 * @param station
	 * @return la liste des zones ou peut se trouver une station
	 */
	public ArrayList<Integer> zonesOfStation(String station) {
		List<Zone> zones = this.getZones();
		List<Integer> zonesId = new ArrayList<>();
		List<Station> stations = new ArrayList<Station>();

		for (int i = 0; i < zones.size(); i++) {
			stations = zones.get(i).getStations();
			for (Station s : stations) {
				// * System.out.println(s.getId());
				if (s.getName().equals(station))
					zonesId.add(i + 1);

			}
		}
		return (ArrayList<Integer>) zonesId;
	}

}
