package br.com.maplink2.webservices;

public class RouteSoapProxy implements br.com.maplink2.webservices.RouteSoap {
  private String _endpoint = null;
  private br.com.maplink2.webservices.RouteSoap routeSoap = null;
  
  public RouteSoapProxy() {
    _initRouteSoapProxy();
  }
  
  public RouteSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initRouteSoapProxy();
  }
  
  private void _initRouteSoapProxy() {
    try {
      routeSoap = (new br.com.maplink2.webservices.RouteLocator()).getRouteSoap();
      if (routeSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)routeSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)routeSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (routeSoap != null)
      ((javax.xml.rpc.Stub)routeSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.maplink2.webservices.RouteSoap getRouteSoap() {
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap;
  }
  
  public br.com.maplink2.webservices.RouteTotals getRouteTotals(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteTotals(rs, ro, token);
  }
  
  public br.com.maplink2.webservices.RouteTotals[] getRouteTotalsBatch(br.com.maplink2.webservices.RouteArray[] ra, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteTotalsBatch(ra, ro, token);
  }
  
  public br.com.maplink2.webservices.AlternativeRouteInfo getRouteWithAlternatives(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteWithAlternatives(rs, ro, token);
  }
  
  public br.com.maplink2.webservices.MultiRoute getMultiRoute(br.com.maplink2.webservices.MultiRouteRequest[] request, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getMultiRoute(request, ro, token);
  }
  
  public br.com.maplink2.webservices.RouteInfo getRoute(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRoute(rs, ro, token);
  }
  
  public br.com.maplink2.webservices.RouteSummary[] getRouteSummary(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteSummary(rs, ro, token);
  }
  
  public br.com.maplink2.webservices.SegmentDescription[] getRouteDescription(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteDescription(rs, ro, token);
  }
  
  public br.com.maplink2.webservices.RouteInfo getRouteWithMap(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, br.com.maplink2.webservices.MapOptions mo, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteWithMap(rs, ro, mo, token);
  }
  
  
}