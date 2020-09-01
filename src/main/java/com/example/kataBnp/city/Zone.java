package com.example.kataBnp.city;

import java.util.ArrayList;
import java.util.List;

public class Zone {
	private int id;
	private String name;
	List<Station> stations = new ArrayList<Station>();

	public int getId() {
		return id;
	}

	public Zone(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Zone(int id, String name, List<Station> stations) {
		super();
		this.id = id;
		this.name = name;
		this.stations = stations;
	}

	public List<Station> getStations() {
		return stations;
	}

	public void setStations(List<Station> stations) {
		this.stations = stations;
	}

}
