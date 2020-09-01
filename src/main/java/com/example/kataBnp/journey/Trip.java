package com.example.kataBnp.journey;

public class Trip {

	private String stationFrom;
	private String stationTo;
	private int startedJoureyAt;
	private int costInCents;
	private int zoneFrom;
	private int zoneTo;

	public String getStationFrom() {
		return stationFrom;
	}

	public void setStationFrom(String stationFrom) {
		this.stationFrom = stationFrom;
	}

	public String getStationTo() {
		return stationTo;
	}

	public void setStationTo(String stationTo) {
		this.stationTo = stationTo;
	}

	public int getStartedJoureyAt() {
		return startedJoureyAt;
	}

	public void setStartedJoureyAt(int startedJoureyAt) {
		this.startedJoureyAt = startedJoureyAt;
	}

	public int getCostInCents() {
		return costInCents;
	}

	public void setCostInCents(int costInCents) {
		this.costInCents = costInCents;
	}

	public int getZoneFrom() {
		return zoneFrom;
	}

	public void setZoneFrom(int zoneFrom) {
		this.zoneFrom = zoneFrom;
	}

	public int getZoneTo() {
		return zoneTo;
	}

	public void setZoneTo(int zoneTo) {
		this.zoneTo = zoneTo;
	}

}
