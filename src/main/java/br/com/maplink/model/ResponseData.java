package br.com.maplink.model;

public class ResponseData {

	private String id;
	private double fuelCost;
	private double distance;
	private String totalTime;

	public ResponseData() {
	
	}
	
	public ResponseData(String id, double fuelCost, double distance,
			String totalTime) {
		this.id = id;
		this.fuelCost = fuelCost;
		this.distance = distance;
		this.totalTime = totalTime;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getFuelCost() {
		return fuelCost;
	}

	public void setFuelCost(double fuelCost) {
		this.fuelCost = fuelCost;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

}
