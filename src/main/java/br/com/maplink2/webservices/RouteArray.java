/**
 * RouteArray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class RouteArray  implements java.io.Serializable {
    private br.com.maplink2.webservices.RouteStop origin;

    private br.com.maplink2.webservices.RouteStop dest;

    public RouteArray() {
    }

    public RouteArray(
           br.com.maplink2.webservices.RouteStop origin,
           br.com.maplink2.webservices.RouteStop dest) {
           this.origin = origin;
           this.dest = dest;
    }


    /**
     * Gets the origin value for this RouteArray.
     * 
     * @return origin
     */
    public br.com.maplink2.webservices.RouteStop getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this RouteArray.
     * 
     * @param origin
     */
    public void setOrigin(br.com.maplink2.webservices.RouteStop origin) {
        this.origin = origin;
    }


    /**
     * Gets the dest value for this RouteArray.
     * 
     * @return dest
     */
    public br.com.maplink2.webservices.RouteStop getDest() {
        return dest;
    }


    /**
     * Sets the dest value for this RouteArray.
     * 
     * @param dest
     */
    public void setDest(br.com.maplink2.webservices.RouteStop dest) {
        this.dest = dest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteArray)) return false;
        RouteArray other = (RouteArray) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.dest==null && other.getDest()==null) || 
             (this.dest!=null &&
              this.dest.equals(other.getDest())));
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
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDest() != null) {
            _hashCode += getDest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteArray.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteArray"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteStop"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Dest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteStop"));
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
