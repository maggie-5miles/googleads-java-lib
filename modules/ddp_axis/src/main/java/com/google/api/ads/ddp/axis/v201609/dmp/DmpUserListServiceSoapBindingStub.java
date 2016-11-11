/**
 * DmpUserListServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201609.dmp;

public class DmpUserListServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "clientCustomerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ClientCustomerId"), com.google.api.ads.ddp.axis.v201609.dmp.ClientCustomerId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "serviceSelector"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "Selector"), com.google.api.ads.ddp.axis.v201609.dmp.Selector.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListPage"));
        oper.setReturnClass(com.google.api.ads.ddp.axis.v201609.dmp.UserListPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ApiExceptionFault"),
                      "com.google.api.ads.ddp.axis.v201609.dmp.ApiException",
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mutate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "clientCustomerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ClientCustomerId"), com.google.api.ads.ddp.axis.v201609.dmp.ClientCustomerId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListOperation"), com.google.api.ads.ddp.axis.v201609.dmp.UserListOperation[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListReturnValue"));
        oper.setReturnClass(com.google.api.ads.ddp.axis.v201609.dmp.UserListReturnValue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ApiExceptionFault"),
                      "com.google.api.ads.ddp.axis.v201609.dmp.ApiException",
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

    }

    public DmpUserListServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DmpUserListServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DmpUserListServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
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
            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "AccessReason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.AccessReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "AccountUserListStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.AccountUserListStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.ApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "AuthenticationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.AuthenticationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "AuthenticationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.AuthenticationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "AuthorizationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.AuthorizationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "AuthorizationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.AuthorizationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "BasicUserList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.BasicUserList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ClientCustomerId");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.ClientCustomerId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "CollectionSizeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.CollectionSizeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "CollectionSizeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.CollectionSizeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DatabaseError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DatabaseError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DatabaseError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DatabaseErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DateError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DateError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DateError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DateErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DistinctError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DistinctError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DistinctError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DistinctErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DmpUserListBillingInfo");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListBillingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DmpUserListServiceError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListServiceError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DmpUserListServiceError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListServiceErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DmpUserListSyncInfo");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListSyncInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DmpUserListSyncStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListSyncStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "EntityNotFound");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.EntityNotFound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "EntityNotFound.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.EntityNotFoundReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "InternalApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.InternalApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "InternalApiError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.InternalApiErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ListReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.ListReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "NotEmptyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.NotEmptyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "NotEmptyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.NotEmptyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "NotWhitelistedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.NotWhitelistedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "NotWhitelistedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.NotWhitelistedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "NullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.NullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "NullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.NullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "Operation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "OperationAccessDenied");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.OperationAccessDenied.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "OperationAccessDenied.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.OperationAccessDeniedReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.Operator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "OperatorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.OperatorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "OperatorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.OperatorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "OrderBy");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.OrderBy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "Page");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.Page.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "Paging");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.Paging.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "Predicate");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.Predicate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "Predicate.Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.PredicateOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "Product");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "QuotaCheckError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.QuotaCheckError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "QuotaCheckError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.QuotaCheckErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "RangeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.RangeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "RangeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.RangeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "RateExceededError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.RateExceededError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "RateExceededError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.RateExceededErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ReadOnlyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.ReadOnlyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "ReadOnlyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.ReadOnlyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "RejectedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.RejectedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "RejectedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.RejectedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "RequiredError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.RequiredError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "RequiredError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.RequiredErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "Selector");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.Selector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "SelectorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.SelectorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "SelectorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.SelectorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "SizeLimitError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.SizeLimitError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "SizeLimitError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.SizeLimitErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "SizeRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.SizeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "SoapHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.SoapHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "SoapResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.SoapResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "SortOrder");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "StringLengthError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.StringLengthError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "StringLengthError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.StringLengthErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.UserList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListConversionType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.UserListConversionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListConversionType.Category");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.UserListConversionTypeCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.UserListError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.UserListErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListMembershipStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.UserListMembershipStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.UserListOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.UserListPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.UserListReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.dmp.UserListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

    public com.google.api.ads.ddp.axis.v201609.dmp.UserListPage get(com.google.api.ads.ddp.axis.v201609.dmp.ClientCustomerId clientCustomerId, com.google.api.ads.ddp.axis.v201609.dmp.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.ddp.axis.v201609.dmp.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "get"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {clientCustomerId, serviceSelector});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.ddp.axis.v201609.dmp.UserListPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.ddp.axis.v201609.dmp.UserListPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.ddp.axis.v201609.dmp.UserListPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.ddp.axis.v201609.dmp.ApiException) {
              throw (com.google.api.ads.ddp.axis.v201609.dmp.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.ddp.axis.v201609.dmp.UserListReturnValue mutate(com.google.api.ads.ddp.axis.v201609.dmp.ClientCustomerId clientCustomerId, com.google.api.ads.ddp.axis.v201609.dmp.UserListOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.ddp.axis.v201609.dmp.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "mutate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {clientCustomerId, operations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.ddp.axis.v201609.dmp.UserListReturnValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.ddp.axis.v201609.dmp.UserListReturnValue) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.ddp.axis.v201609.dmp.UserListReturnValue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.ddp.axis.v201609.dmp.ApiException) {
              throw (com.google.api.ads.ddp.axis.v201609.dmp.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
