/**
 * UserListServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201609.provider;

public class UserListServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.ddp.axis.v201609.provider.UserListServiceInterface {
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
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "serviceSelector"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "Selector"), com.google.api.ads.ddp.axis.v201609.provider.Selector.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListPage"));
        oper.setReturnClass(com.google.api.ads.ddp.axis.v201609.provider.UserListPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "ApiExceptionFault"),
                      "com.google.api.ads.ddp.axis.v201609.provider.ApiException",
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mutate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListOperation"), com.google.api.ads.ddp.axis.v201609.provider.UserListOperation[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListReturnValue"));
        oper.setReturnClass(com.google.api.ads.ddp.axis.v201609.provider.UserListReturnValue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "ApiExceptionFault"),
                      "com.google.api.ads.ddp.axis.v201609.provider.ApiException",
                      new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

    }

    public UserListServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public UserListServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public UserListServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "AccessReason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.AccessReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "AccountUserListStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.AccountUserListStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "ApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.ApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "AuthenticationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.AuthenticationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "AuthenticationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.AuthenticationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "AuthorizationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.AuthorizationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "AuthorizationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.AuthorizationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "BasicUserList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.BasicUserList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "CollectionSizeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.CollectionSizeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "CollectionSizeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.CollectionSizeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "DatabaseError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.DatabaseError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "DatabaseError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.DatabaseErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "DateError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.DateError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "DateError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.DateErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "DistinctError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.DistinctError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "DistinctError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.DistinctErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "EntityNotFound");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.EntityNotFound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "EntityNotFound.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.EntityNotFoundReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "InternalApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.InternalApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "InternalApiError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.InternalApiErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "ListReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.ListReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "LogicalUserList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.LogicalUserList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "LogicalUserListOperand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.LogicalUserListOperand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "NotEmptyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.NotEmptyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "NotEmptyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.NotEmptyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "NotWhitelistedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.NotWhitelistedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "NotWhitelistedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.NotWhitelistedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "NullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.NullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "NullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.NullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "Operation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "OperationAccessDenied");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.OperationAccessDenied.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "OperationAccessDenied.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.OperationAccessDeniedReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.Operator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "OperatorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.OperatorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "OperatorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.OperatorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "OrderBy");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.OrderBy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "Page");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.Page.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "Paging");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.Paging.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "Predicate");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.Predicate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "Predicate.Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.PredicateOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "QuotaCheckError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.QuotaCheckError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "QuotaCheckError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.QuotaCheckErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "RangeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.RangeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "RangeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.RangeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "RateExceededError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.RateExceededError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "RateExceededError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.RateExceededErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "ReadOnlyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.ReadOnlyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "ReadOnlyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.ReadOnlyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "RejectedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.RejectedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "RejectedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.RejectedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "RequiredError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.RequiredError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "RequiredError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.RequiredErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "Selector");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.Selector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "SelectorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.SelectorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "SelectorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.SelectorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "SizeLimitError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.SizeLimitError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "SizeLimitError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.SizeLimitErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "SizeRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.SizeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "SoapHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.SoapHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "SoapResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.SoapResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "SortOrder");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "StringFormatError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.StringFormatError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "StringFormatError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.StringFormatErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "StringLengthError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.StringLengthError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "StringLengthError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.StringLengthErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListConversionType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserListConversionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListConversionType.Category");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserListConversionTypeCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserListError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserListErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListLogicalRule");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserListLogicalRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListLogicalRule.Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserListLogicalRuleOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListMembershipStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserListMembershipStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserListOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserListPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserListReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "UserListType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.ddp.axis.v201609.provider.UserListType.class;
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

    public com.google.api.ads.ddp.axis.v201609.provider.UserListPage get(com.google.api.ads.ddp.axis.v201609.provider.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.ddp.axis.v201609.provider.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "get"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceSelector});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.ddp.axis.v201609.provider.UserListPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.ddp.axis.v201609.provider.UserListPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.ddp.axis.v201609.provider.UserListPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.ddp.axis.v201609.provider.ApiException) {
              throw (com.google.api.ads.ddp.axis.v201609.provider.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.ddp.axis.v201609.provider.UserListReturnValue mutate(com.google.api.ads.ddp.axis.v201609.provider.UserListOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.ddp.axis.v201609.provider.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201609", "mutate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {operations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.ddp.axis.v201609.provider.UserListReturnValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.ddp.axis.v201609.provider.UserListReturnValue) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.ddp.axis.v201609.provider.UserListReturnValue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.ddp.axis.v201609.provider.ApiException) {
              throw (com.google.api.ads.ddp.axis.v201609.provider.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
