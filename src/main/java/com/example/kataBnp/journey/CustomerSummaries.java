package com.example.kataBnp.journey;

import java.util.List;

public class CustomerSummaries {

	private int costumerid;
	private int totalCostInCents;
	private List<Trip> trips;

	public int getCostumerid() {
		return costumerid;
	}

	public void setCostumerid(int costumerid) {
		this.costumerid = costumerid;
	}

	public int getTotalCostInCents() {
		return totalCostInCents;
	}

	public void setTotalCostInCents(int totalCostInCents) {
		this.totalCostInCents = totalCostInCents;
	}

	public List<Trip> getTrips() {
		return trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}

}
