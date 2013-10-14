package br.com.maplink.app;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.com.maplink.RequestJSON;
import br.com.maplink.model.RequestData;
import br.com.maplink.model.ResponseData;
import br.com.maplink2.webservices.Point;
import br.com.maplink2.webservices.RouteDetails;
import br.com.maplink2.webservices.RouteInfo;
import br.com.maplink2.webservices.RouteLocator;
import br.com.maplink2.webservices.RouteOptions;
import br.com.maplink2.webservices.RouteStop;
import br.com.maplink2.webservices.Vehicle;

import com.google.gson.Gson;

public class MainApp {

	public static void main(String[] args) throws RemoteException, ServiceException {
		
		final String TOKEN = "c13iyCvmcC9mzwkLd0LCbmYC5mUF5m2jNGNtNGt6NmK6NJK=";
		
		final String REQUEST_JSON = RequestJSON.REQUEST_JSON;
		
		Gson gson = new Gson();
		
		RequestData[] requestData = gson.fromJson(REQUEST_JSON, RequestData[].class);
		
		RouteStop[] routes = null;
		
		for(RequestData data : requestData){ 
			if(data != null){
				Point point = new Point(data.getOriginCoordinate().getLongitude(), data.getOriginCoordinate().getLatitude());
				RouteStop originRoute = new RouteStop("Origin", point);
				 
				point = new Point(data.getDestinationCoordinate().getLongitude(), data.getDestinationCoordinate().getLatitude());
				RouteStop destinationRoute = new RouteStop("Destination", point);
				
				routes = new RouteStop[] { originRoute, destinationRoute };
			}
		}
		 
		RouteDetails routeDetails = new RouteDetails();
		routeDetails.setDescriptionType(0);
		routeDetails.setRouteType(1);
		routeDetails.setOptimizeRoute(true);
		 
		Vehicle vehicle = new Vehicle();
		vehicle.setTankCapacity(20);
		vehicle.setAverageConsumption(9);
		vehicle.setFuelPrice(3);
		vehicle.setAverageSpeed(60);
		vehicle.setTollFeeCat(2);
		 
		RouteOptions routeOptions = new RouteOptions();
		routeOptions.setLanguage("portugues");
		routeOptions.setRouteDetails(routeDetails);
		routeOptions.setVehicle(vehicle);
	
		RouteLocator routeLocator = new RouteLocator();
		RouteInfo getRouteResponse = routeLocator.getRouteSoap().getRoute(routes, routeOptions, TOKEN);
		
		ResponseData responseData = new ResponseData(getRouteResponse.getRouteId(), getRouteResponse.getRouteTotals().getTotalfuelCost(), getRouteResponse.getRouteTotals().getTotalDistance(), getRouteResponse.getRouteTotals().getTotalTime());
		
		String responseJson = gson.toJson(responseData);
		
		System.out.println(responseJson);
	}
	
}
