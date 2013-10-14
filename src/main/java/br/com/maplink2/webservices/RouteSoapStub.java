/**
 * RouteSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink2.webservices;

public class RouteSoapStub extends org.apache.axis.client.Stub implements br.com.maplink2.webservices.RouteSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRouteTotals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "rs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteStop"), br.com.maplink2.webservices.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteOptions"), br.com.maplink2.webservices.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteTotals"));
        oper.setReturnClass(br.com.maplink2.webservices.RouteTotals.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRouteTotalsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRouteTotalsBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ra"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteArray"), br.com.maplink2.webservices.RouteArray[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteArray"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteOptions"), br.com.maplink2.webservices.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteTotals"));
        oper.setReturnClass(br.com.maplink2.webservices.RouteTotals[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "GetRouteTotalsBatchResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteTotals"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRouteWithAlternatives");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "rs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteStop"), br.com.maplink2.webservices.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteOptions"), br.com.maplink2.webservices.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AlternativeRouteInfo"));
        oper.setReturnClass(br.com.maplink2.webservices.AlternativeRouteInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRouteWithAlternativesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMultiRoute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfMultiRouteRequest"), br.com.maplink2.webservices.MultiRouteRequest[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MultiRouteRequest"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteOptions"), br.com.maplink2.webservices.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MultiRoute"));
        oper.setReturnClass(br.com.maplink2.webservices.MultiRoute.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getMultiRouteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRoute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "rs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteStop"), br.com.maplink2.webservices.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteOptions"), br.com.maplink2.webservices.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteInfo"));
        oper.setReturnClass(br.com.maplink2.webservices.RouteInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRouteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRouteSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "rs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteStop"), br.com.maplink2.webservices.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteOptions"), br.com.maplink2.webservices.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteSummary"));
        oper.setReturnClass(br.com.maplink2.webservices.RouteSummary[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRouteSummaryResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteSummary"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRouteDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "rs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteStop"), br.com.maplink2.webservices.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteOptions"), br.com.maplink2.webservices.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfSegmentDescription"));
        oper.setReturnClass(br.com.maplink2.webservices.SegmentDescription[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRouteDescriptionResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "SegmentDescription"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRouteWithMap");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "rs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteStop"), br.com.maplink2.webservices.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteOptions"), br.com.maplink2.webservices.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "mo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MapOptions"), br.com.maplink2.webservices.MapOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteInfo"));
        oper.setReturnClass(br.com.maplink2.webservices.RouteInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRouteWithMapResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

    }

    public RouteSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public RouteSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public RouteSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "AlternativeRouteInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.AlternativeRouteInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfMultiRouteRequest");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.MultiRouteRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MultiRouteRequest");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MultiRouteRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfPOIDetails");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.POIDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "POIDetails");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "POIDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfPoint");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.Point[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Point");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Point");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteArray");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteArray[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteArray");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteArray");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteInfo");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteLine");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteLine[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteLine");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteLine");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteStop");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteStop[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteStop");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteStop");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteSummary");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteSummary");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteSummary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfRouteTotals");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteTotals[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteTotals");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteTotals");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfSegmentDescription");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.SegmentDescription[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "SegmentDescription");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "SegmentDescription");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfSingleRouteTotals");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.SingleRouteTotals[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "SingleRouteTotals");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "SingleRouteTotals");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "City");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.City.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Extent");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.Extent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MapInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.MapInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MapOptions");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.MapOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MapSize");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.MapSize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MultiRoute");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.MultiRoute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "MultiRouteRequest");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.MultiRouteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "POIDetails");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.POIDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Point");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.Point.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RoadType");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RoadType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteArray");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteDetails");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteLine");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteOptions");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteStop");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteStop.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteSummary");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "RouteTotals");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.RouteTotals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "SegmentDescription");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.SegmentDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "SingleRouteTotals");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.SingleRouteTotals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "TollFeeDetails");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.TollFeeDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "Vehicle");
            cachedSerQNames.add(qName);
            cls = br.com.maplink2.webservices.Vehicle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.maplink2.webservices.RouteTotals getRouteTotals(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/getRouteTotals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRouteTotals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rs, ro, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.RouteTotals) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.RouteTotals) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.RouteTotals.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.RouteTotals[] getRouteTotalsBatch(br.com.maplink2.webservices.RouteArray[] ra, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/GetRouteTotalsBatch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "GetRouteTotalsBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ra, ro, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.RouteTotals[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.RouteTotals[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.RouteTotals[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.AlternativeRouteInfo getRouteWithAlternatives(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/getRouteWithAlternatives");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRouteWithAlternatives"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rs, ro, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.AlternativeRouteInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.AlternativeRouteInfo) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.AlternativeRouteInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.MultiRoute getMultiRoute(br.com.maplink2.webservices.MultiRouteRequest[] request, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/getMultiRoute");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getMultiRoute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, ro, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.MultiRoute) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.MultiRoute) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.MultiRoute.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.RouteInfo getRoute(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/getRoute");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRoute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rs, ro, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.RouteInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.RouteInfo) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.RouteInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.RouteSummary[] getRouteSummary(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/getRouteSummary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRouteSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rs, ro, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.RouteSummary[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.RouteSummary[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.RouteSummary[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.SegmentDescription[] getRouteDescription(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/getRouteDescription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRouteDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rs, ro, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.SegmentDescription[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.SegmentDescription[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.SegmentDescription[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink2.webservices.RouteInfo getRouteWithMap(br.com.maplink2.webservices.RouteStop[] rs, br.com.maplink2.webservices.RouteOptions ro, br.com.maplink2.webservices.MapOptions mo, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.maplink2.com.br/getRouteWithMap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.maplink2.com.br", "getRouteWithMap"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rs, ro, mo, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink2.webservices.RouteInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink2.webservices.RouteInfo) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink2.webservices.RouteInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
