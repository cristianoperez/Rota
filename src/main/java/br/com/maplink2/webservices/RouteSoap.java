/**
 * RouteSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public interface RouteSoap extends java.rmi.Remote {

    /**
     * Calcula os totais da rota informada.
     */
    public br.com.maplink2.webservices.RouteTotals getRouteTotals(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Calcula os totais das rotas informadas no array.
     */
    public br.com.maplink2.webservices.RouteTotals[] getRouteTotalsBatch(br.com.maplink2.webservices.RouteArray[] ra, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Retorna a rota entre os pontos informados com até duas alternativas
     * (caso exista)
     */
    public br.com.maplink2.webservices.AlternativeRouteInfo getRouteWithAlternatives(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Retorna rotas entre os pontos de origem e destinos informados.
     */
    public br.com.maplink2.webservices.MultiRoute getMultiRoute(br.com.maplink2.webservices.MultiRouteRequest[] request, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Retorna a rota entre os pontos informados.
     */
    public br.com.maplink2.webservices.RouteInfo getRoute(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Gera o resumo da rota.
     */
    public br.com.maplink2.webservices.RouteSummary[] getRouteSummary(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Gera a descrição da rota.
     */
    public br.com.maplink2.webservices.SegmentDescription[] getRouteDescription(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Calcula a rota e gera a imagem do mapa.
     */
    public br.com.maplink2.webservices.RouteInfo getRouteWithMap(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, br.com.maplink2.webservices.MapOptions mo, java.lang.String token) throws java.rmi.RemoteException;
}
