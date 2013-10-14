/**
 * Vehicle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class Vehicle  implements java.io.Serializable {
    private int tankCapacity;

    private float averageConsumption;

    private double fuelPrice;

    private int averageSpeed;

    private int tollFeeCat;

    public Vehicle() {
    }

    public Vehicle(
           int tankCapacity,
           float averageConsumption,
           double fuelPrice,
           int averageSpeed,
           int tollFeeCat) {
           this.tankCapacity = tankCapacity;
           this.averageConsumption = averageConsumption;
           this.fuelPrice = fuelPrice;
           this.averageSpeed = averageSpeed;
           this.tollFeeCat = tollFeeCat;
    }


    /**
     * Gets the tankCapacity value for this Vehicle.
     * 
     * @return tankCapacity
     */
    public int getTankCapacity() {
        return tankCapacity;
    }


    /**
     * Sets the tankCapacity value for this Vehicle.
     * 
     * @param tankCapacity
     */
    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }


    /**
     * Gets the averageConsumption value for this Vehicle.
     * 
     * @return averageConsumption
     */
    public float getAverageConsumption() {
        return averageConsumption;
    }


    /**
     * Sets the averageConsumption value for this Vehicle.
     * 
     * @param averageConsumption
     */
    public void setAverageConsumption(float averageConsumption) {
        this.averageConsumption = averageConsumption;
    }


    /**
     * Gets the fuelPrice value for this Vehicle.
     * 
     * @return fuelPrice
     */
    public double getFuelPrice() {
        return fuelPrice;
    }


    /**
     * Sets the fuelPrice value for this Vehicle.
     * 
     * @param fuelPrice
     */
    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }


    /**
     * Gets the averageSpeed value for this Vehicle.
     * 
     * @return averageSpeed
     */
    public int getAverageSpeed() {
        return averageSpeed;
    }


    /**
     * Sets the averageSpeed value for this Vehicle.
     * 
     * @param averageSpeed
     */
    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }


    /**
     * Gets the tollFeeCat value for this Vehicle.
     * 
     * @return tollFeeCat
     */
    public int getTollFeeCat() {
        return tollFeeCat;
    }


    /**
     * Sets the tollFeeCat value for this Vehicle.
     * 
     * @param tollFeeCat
     */
    public void setTollFeeCat(int tollFeeCat) {
        this.tollFeeCat = tollFeeCat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.tankCapacity == other.getTankCapacity() &&
            this.averageConsumption == other.getAverageConsumption() &&
            this.fuelPrice == other.getFuelPrice() &&
            this.averageSpeed == other.getAverageSpeed() &&
            this.tollFeeCat == other.getTollFeeCat();
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
        _hashCode += getTankCapacity();
        _hashCode += new Float(getAverageConsumption()).hashCode();
        _hashCode += new Double(getFuelPrice()).hashCode();
        _hashCode += getAverageSpeed();
        _hashCode += getTollFeeCat();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vehicle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Vehicle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tankCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "tankCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageConsumption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "averageConsumption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuelPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "fuelPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "averageSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tollFeeCat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "tollFeeCat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
