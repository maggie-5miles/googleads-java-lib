/**
 * DmpUserListServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201705.dmp;

public class DmpUserListServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.ddp.axis.v201705.dmp.DmpUserListServiceInterface {
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
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "clientCustomerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ClientCustomerId"), com.google.api.ads.ddp.axis.v201705.dmp.ClientCustomerId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "serviceSelector"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "Selector"), com.google.api.ads.ddp.axis.v201705.dmp.Selector.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListPage"));
        oper.setReturnClass(com.google.api.ads.ddp.axis.v201705.dmp.UserListPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ApiExceptionFault"),
                      "com.google.api.ads.ddp.axis.v201705.dmp.ApiException",
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mutate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "clientCustomerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ClientCustomerId"), com.google.api.ads.ddp.axis.v201705.dmp.ClientCustomerId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListOperation"), com.google.api.ads.ddp.axis.v201705.dmp.UserListOperation[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListReturnValue"));
        oper.setReturnClass(com.google.api.ads.ddp.axis.v201705.dmp.UserListReturnValue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ApiExceptionFault"),
                      "com.google.api.ads.ddp.axis.v201705.dmp.ApiException",
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ApiException"), 
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
            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "AccessReason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.AccessReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "AccountUserListStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.AccountUserListStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.ApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "AuthenticationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.AuthenticationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "AuthenticationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.AuthenticationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "AuthorizationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.AuthorizationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "AuthorizationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.AuthorizationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "BasicUserList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.BasicUserList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ClientCustomerId");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.ClientCustomerId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "CollectionSizeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.CollectionSizeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "CollectionSizeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.CollectionSizeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DatabaseError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DatabaseError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DatabaseError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DatabaseErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DateError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DateError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DateError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DateErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DistinctError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DistinctError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DistinctError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DistinctErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DmpUserListBillingInfo");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DmpUserListBillingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DmpUserListServiceError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DmpUserListServiceError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DmpUserListServiceError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DmpUserListServiceErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DmpUserListSyncInfo");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DmpUserListSyncInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "DmpUserListSyncStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.DmpUserListSyncStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "EntityNotFound");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.EntityNotFound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "EntityNotFound.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.EntityNotFoundReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "FieldPathElement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.FieldPathElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "InternalApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.InternalApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "InternalApiError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.InternalApiErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ListReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.ListReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "NotEmptyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.NotEmptyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "NotEmptyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.NotEmptyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "NotWhitelistedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.NotWhitelistedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "NotWhitelistedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.NotWhitelistedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "NullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.NullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "NullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.NullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "Operation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "OperationAccessDenied");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.OperationAccessDenied.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "OperationAccessDenied.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.OperationAccessDeniedReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.Operator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "OperatorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.OperatorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "OperatorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.OperatorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "OrderBy");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.OrderBy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "Page");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.Page.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "Paging");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.Paging.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "Predicate");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.Predicate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "Predicate.Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.PredicateOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "Product");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "QuotaCheckError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.QuotaCheckError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "QuotaCheckError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.QuotaCheckErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "RangeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.RangeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "RangeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.RangeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "RateExceededError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.RateExceededError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "RateExceededError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.RateExceededErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ReadOnlyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.ReadOnlyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "ReadOnlyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.ReadOnlyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "RejectedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.RejectedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "RejectedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.RejectedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "RequestError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.RequestError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "RequestError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.RequestErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "RequiredError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.RequiredError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "RequiredError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.RequiredErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "Selector");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.Selector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "SelectorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.SelectorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "SelectorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.SelectorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "SizeLimitError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.SizeLimitError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "SizeLimitError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.SizeLimitErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "SizeRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.SizeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "SoapHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.SoapHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "SoapResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.SoapResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "SortOrder");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "StringLengthError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.StringLengthError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "StringLengthError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.StringLengthErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.UserList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListClosingReason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.UserListClosingReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListConversionType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.UserListConversionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListConversionType.Category");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.UserListConversionTypeCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.UserListError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.UserListErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListMembershipStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.UserListMembershipStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.UserListOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.UserListPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.UserListReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "UserListType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201705.dmp.UserListType.class;
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

    public com.google.api.ads.ddp.axis.v201705.dmp.UserListPage get(com.google.api.ads.ddp.axis.v201705.dmp.ClientCustomerId clientCustomerId, com.google.api.ads.ddp.axis.v201705.dmp.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.ddp.axis.v201705.dmp.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "get"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {clientCustomerId, serviceSelector});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.ddp.axis.v201705.dmp.UserListPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.ddp.axis.v201705.dmp.UserListPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.ddp.axis.v201705.dmp.UserListPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.ddp.axis.v201705.dmp.ApiException) {
              throw (com.google.api.ads.ddp.axis.v201705.dmp.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.ddp.axis.v201705.dmp.UserListReturnValue mutate(com.google.api.ads.ddp.axis.v201705.dmp.ClientCustomerId clientCustomerId, com.google.api.ads.ddp.axis.v201705.dmp.UserListOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.ddp.axis.v201705.dmp.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201705", "mutate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {clientCustomerId, operations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.ddp.axis.v201705.dmp.UserListReturnValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.ddp.axis.v201705.dmp.UserListReturnValue) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.ddp.axis.v201705.dmp.UserListReturnValue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.ddp.axis.v201705.dmp.ApiException) {
              throw (com.google.api.ads.ddp.axis.v201705.dmp.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
