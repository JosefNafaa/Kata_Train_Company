package com.example.kataBnp.journey;

public class Travel {

	private int zoneFrom;
	private int zoneTo;
	private String stationFrom;
	private String stationTo;
	private double price;

	public Travel() {

	}

	public Travel(int zoneFrom, int zoneTo, String stationFrom, String stationTo, double price) {
		super();
		this.zoneFrom = zoneFrom;
		this.zoneTo = zoneTo;
		this.stationFrom = stationFrom;
		this.stationTo = stationTo;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Travel [zoneFrom=" + zoneFrom + ", zoneTo=" + zoneTo + ", stationFrom=" + stationFrom + ", stationTo="
				+ stationTo + ", price=" + price + "]";
	}

}
