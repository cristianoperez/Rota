/**
 * RouteInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class RouteInfo  implements java.io.Serializable {
    private java.lang.String routeId;

    private br.com.maplink2.webservices.MapInfo mapInfo;

    private br.com.maplink2.webservices.SegmentDescription[] segDescription;

    private br.com.maplink2.webservices.RouteTotals routeTotals;

    private br.com.maplink2.webservices.RouteSummary[] routeSummary;

    private br.com.maplink2.webservices.RoadType roadType;

    public RouteInfo() {
    }

    public RouteInfo(
           java.lang.String routeId,
           br.com.maplink2.webservices.MapInfo mapInfo,
           br.com.maplink2.webservices.SegmentDescription[] segDescription,
           br.com.maplink2.webservices.RouteTotals routeTotals,
           br.com.maplink2.webservices.RouteSummary[] routeSummary,
           br.com.maplink2.webservices.RoadType roadType) {
           this.routeId = routeId;
           this.mapInfo = mapInfo;
           this.segDescription = segDescription;
           this.routeTotals = routeTotals;
           this.routeSummary = routeSummary;
           this.roadType = roadType;
    }


    /**
     * Gets the routeId value for this RouteInfo.
     * 
     * @return routeId
     */
    public java.lang.String getRouteId() {
        return routeId;
    }


    /**
     * Sets the routeId value for this RouteInfo.
     * 
     * @param routeId
     */
    public void setRouteId(java.lang.String routeId) {
        this.routeId = routeId;
    }


    /**
     * Gets the mapInfo value for this RouteInfo.
     * 
     * @return mapInfo
     */
    public br.com.maplink2.webservices.MapInfo getMapInfo() {
        return mapInfo;
    }


    /**
     * Sets the mapInfo value for this RouteInfo.
     * 
     * @param mapInfo
     */
    public void setMapInfo(br.com.maplink2.webservices.MapInfo mapInfo) {
        this.mapInfo = mapInfo;
    }


    /**
     * Gets the segDescription value for this RouteInfo.
     * 
     * @return segDescription
     */
    public br.com.maplink2.webservices.SegmentDescription[] getSegDescription() {
        return segDescription;
    }


    /**
     * Sets the segDescription value for this RouteInfo.
     * 
     * @param segDescription
     */
    public void setSegDescription(br.com.maplink2.webservices.SegmentDescription[] segDescription) {
        this.segDescription = segDescription;
    }


    /**
     * Gets the routeTotals value for this RouteInfo.
     * 
     * @return routeTotals
     */
    public br.com.maplink2.webservices.RouteTotals getRouteTotals() {
        return routeTotals;
    }


    /**
     * Sets the routeTotals value for this RouteInfo.
     * 
     * @param routeTotals
     */
    public void setRouteTotals(br.com.maplink2.webservices.RouteTotals routeTotals) {
        this.routeTotals = routeTotals;
    }


    /**
     * Gets the routeSummary value for this RouteInfo.
     * 
     * @return routeSummary
     */
    public br.com.maplink2.webservices.RouteSummary[] getRouteSummary() {
        return routeSummary;
    }


    /**
     * Sets the routeSummary value for this RouteInfo.
     * 
     * @param routeSummary
     */
    public void setRouteSummary(br.com.maplink2.webservices.RouteSummary[] routeSummary) {
        this.routeSummary = routeSummary;
    }


    /**
     * Gets the roadType value for this RouteInfo.
     * 
     * @return roadType
     */
    public br.com.maplink2.webservices.RoadType getRoadType() {
        return roadType;
    }


    /**
     * Sets the roadType value for this RouteInfo.
     * 
     * @param roadType
     */
    public void setRoadType(br.com.maplink2.webservices.RoadType roadType) {
        this.roadType = roadType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteInfo)) return false;
        RouteInfo other = (RouteInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.routeId==null && other.getRouteId()==null) || 
             (this.routeId!=null &&
              this.routeId.equals(other.getRouteId()))) &&
            ((this.mapInfo==null && other.getMapInfo()==null) || 
             (this.mapInfo!=null &&
              this.mapInfo.equals(other.getMapInfo()))) &&
            ((this.segDescription==null && other.getSegDescription()==null) || 
             (this.segDescription!=null &&
              java.util.Arrays.equals(this.segDescription, other.getSegDescription()))) &&
            ((this.routeTotals==null && other.getRouteTotals()==null) || 
             (this.routeTotals!=null &&
              this.routeTotals.equals(other.getRouteTotals()))) &&
            ((this.routeSummary==null && other.getRouteSummary()==null) || 
             (this.routeSummary!=null &&
              java.util.Arrays.equals(this.routeSummary, other.getRouteSummary()))) &&
            ((this.roadType==null && other.getRoadType()==null) || 
             (this.roadType!=null &&
              this.roadType.equals(other.getRoadType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRouteId() != null) {
            _hashCode += getRouteId().hashCode();
        }
        if (getMapInfo() != null) {
            _hashCode += getMapInfo().hashCode();
        }
        if (getSegDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRouteTotals() != null) {
            _hashCode += getRouteTotals().hashCode();
        }
        if (getRouteSummary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRouteSummary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRouteSummary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoadType() != null) {
            _hashCode += getRoadType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "routeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MapInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MapInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "segDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "SegmentDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "SegmentDescription"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "routeTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteTotals"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "routeSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteSummary"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "roadType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RoadType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
