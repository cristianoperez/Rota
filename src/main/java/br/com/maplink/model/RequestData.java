package br.com.maplink.model;

public class RequestData {

	private String id;
	private Coordenates originCoordinate;
	private Coordenates destinationCoordinate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Coordenates getOriginCoordinate() {
		return originCoordinate;
	}

	public void setOriginCoordinate(Coordenates originCoordinate) {
		this.originCoordinate = originCoordinate;
	}

	public Coordenates getDestinationCoordinate() {
		return destinationCoordinate;
	}

	public void setDestinationCoordinate(Coordenates destinationCoordinate) {
		this.destinationCoordinate = destinationCoordinate;
	}

}
