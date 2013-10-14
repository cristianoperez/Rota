/**
 * RouteDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class RouteDetails  implements java.io.Serializable {
    private int descriptionType;

    private int routeType;

    private boolean optimizeRoute;

    private java.lang.String[] poiRoute;

    private java.lang.String[] barriersList;

    private br.com.maplink2.webservices.Point[] barrierPoints;

    public RouteDetails() {
    }

    public RouteDetails(
           int descriptionType,
           int routeType,
           boolean optimizeRoute,
           java.lang.String[] poiRoute,
           java.lang.String[] barriersList,
           br.com.maplink2.webservices.Point[] barrierPoints) {
           this.descriptionType = descriptionType;
           this.routeType = routeType;
           this.optimizeRoute = optimizeRoute;
           this.poiRoute = poiRoute;
           this.barriersList = barriersList;
           this.barrierPoints = barrierPoints;
    }


    /**
     * Gets the descriptionType value for this RouteDetails.
     * 
     * @return descriptionType
     */
    public int getDescriptionType() {
        return descriptionType;
    }


    /**
     * Sets the descriptionType value for this RouteDetails.
     * 
     * @param descriptionType
     */
    public void setDescriptionType(int descriptionType) {
        this.descriptionType = descriptionType;
    }


    /**
     * Gets the routeType value for this RouteDetails.
     * 
     * @return routeType
     */
    public int getRouteType() {
        return routeType;
    }


    /**
     * Sets the routeType value for this RouteDetails.
     * 
     * @param routeType
     */
    public void setRouteType(int routeType) {
        this.routeType = routeType;
    }


    /**
     * Gets the optimizeRoute value for this RouteDetails.
     * 
     * @return optimizeRoute
     */
    public boolean isOptimizeRoute() {
        return optimizeRoute;
    }


    /**
     * Sets the optimizeRoute value for this RouteDetails.
     * 
     * @param optimizeRoute
     */
    public void setOptimizeRoute(boolean optimizeRoute) {
        this.optimizeRoute = optimizeRoute;
    }


    /**
     * Gets the poiRoute value for this RouteDetails.
     * 
     * @return poiRoute
     */
    public java.lang.String[] getPoiRoute() {
        return poiRoute;
    }


    /**
     * Sets the poiRoute value for this RouteDetails.
     * 
     * @param poiRoute
     */
    public void setPoiRoute(java.lang.String[] poiRoute) {
        this.poiRoute = poiRoute;
    }


    /**
     * Gets the barriersList value for this RouteDetails.
     * 
     * @return barriersList
     */
    public java.lang.String[] getBarriersList() {
        return barriersList;
    }


    /**
     * Sets the barriersList value for this RouteDetails.
     * 
     * @param barriersList
     */
    public void setBarriersList(java.lang.String[] barriersList) {
        this.barriersList = barriersList;
    }


    /**
     * Gets the barrierPoints value for this RouteDetails.
     * 
     * @return barrierPoints
     */
    public br.com.maplink2.webservices.Point[] getBarrierPoints() {
        return barrierPoints;
    }


    /**
     * Sets the barrierPoints value for this RouteDetails.
     * 
     * @param barrierPoints
     */
    public void setBarrierPoints(br.com.maplink2.webservices.Point[] barrierPoints) {
        this.barrierPoints = barrierPoints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteDetails)) return false;
        RouteDetails other = (RouteDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.descriptionType == other.getDescriptionType() &&
            this.routeType == other.getRouteType() &&
            this.optimizeRoute == other.isOptimizeRoute() &&
            ((this.poiRoute==null && other.getPoiRoute()==null) || 
             (this.poiRoute!=null &&
              java.util.Arrays.equals(this.poiRoute, other.getPoiRoute()))) &&
            ((this.barriersList==null && other.getBarriersList()==null) || 
             (this.barriersList!=null &&
              java.util.Arrays.equals(this.barriersList, other.getBarriersList()))) &&
            ((this.barrierPoints==null && other.getBarrierPoints()==null) || 
             (this.barrierPoints!=null &&
              java.util.Arrays.equals(this.barrierPoints, other.getBarrierPoints())));
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
        _hashCode += getDescriptionType();
        _hashCode += getRouteType();
        _hashCode += (isOptimizeRoute() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPoiRoute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoiRoute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoiRoute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBarriersList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBarriersList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBarriersList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBarrierPoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBarrierPoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBarrierPoints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "descriptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "routeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optimizeRoute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "optimizeRoute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poiRoute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "poiRoute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barriersList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "barriersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barrierPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "barrierPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Point"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Point"));
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
