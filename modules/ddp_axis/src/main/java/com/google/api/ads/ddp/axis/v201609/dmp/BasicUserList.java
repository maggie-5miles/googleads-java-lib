/**
 * BasicUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201609.dmp;


/**
 * User list targeting as a collection of conversion types.
 */
public class BasicUserList  extends com.google.api.ads.ddp.axis.v201609.dmp.UserList  implements java.io.Serializable {
    /* Conversion types associated with this user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionTypes".</span> */
    private com.google.api.ads.ddp.axis.v201609.dmp.UserListConversionType[] conversionTypes;

    /* Information for streamlined user list upload workflow between
     * Google and DMP products.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DmpSyncInfo".</span> */
    private com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListSyncInfo dmpSyncInfo;

    public BasicUserList() {
    }

    public BasicUserList(
           java.lang.Long id,
           java.lang.Boolean isReadOnly,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.ddp.axis.v201609.dmp.UserListMembershipStatus status,
           java.lang.String integrationCode,
           com.google.api.ads.ddp.axis.v201609.dmp.AccessReason accessReason,
           com.google.api.ads.ddp.axis.v201609.dmp.AccountUserListStatus accountUserListStatus,
           java.lang.Long membershipLifeSpan,
           java.lang.Long size,
           com.google.api.ads.ddp.axis.v201609.dmp.SizeRange sizeRange,
           java.lang.Long sizeForSearch,
           com.google.api.ads.ddp.axis.v201609.dmp.SizeRange sizeRangeForSearch,
           com.google.api.ads.ddp.axis.v201609.dmp.UserListType listType,
           java.lang.Boolean isEligibleForSearch,
           java.lang.Boolean isEligibleForDisplay,
           java.lang.String userListType,
           com.google.api.ads.ddp.axis.v201609.dmp.UserListConversionType[] conversionTypes,
           com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListSyncInfo dmpSyncInfo) {
        super(
            id,
            isReadOnly,
            name,
            description,
            status,
            integrationCode,
            accessReason,
            accountUserListStatus,
            membershipLifeSpan,
            size,
            sizeRange,
            sizeForSearch,
            sizeRangeForSearch,
            listType,
            isEligibleForSearch,
            isEligibleForDisplay,
            userListType);
        this.conversionTypes = conversionTypes;
        this.dmpSyncInfo = dmpSyncInfo;
    }


    /**
     * Gets the conversionTypes value for this BasicUserList.
     * 
     * @return conversionTypes   * Conversion types associated with this user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionTypes".</span>
     */
    public com.google.api.ads.ddp.axis.v201609.dmp.UserListConversionType[] getConversionTypes() {
        return conversionTypes;
    }


    /**
     * Sets the conversionTypes value for this BasicUserList.
     * 
     * @param conversionTypes   * Conversion types associated with this user list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ConversionTypes".</span>
     */
    public void setConversionTypes(com.google.api.ads.ddp.axis.v201609.dmp.UserListConversionType[] conversionTypes) {
        this.conversionTypes = conversionTypes;
    }

    public com.google.api.ads.ddp.axis.v201609.dmp.UserListConversionType getConversionTypes(int i) {
        return this.conversionTypes[i];
    }

    public void setConversionTypes(int i, com.google.api.ads.ddp.axis.v201609.dmp.UserListConversionType _value) {
        this.conversionTypes[i] = _value;
    }


    /**
     * Gets the dmpSyncInfo value for this BasicUserList.
     * 
     * @return dmpSyncInfo   * Information for streamlined user list upload workflow between
     * Google and DMP products.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DmpSyncInfo".</span>
     */
    public com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListSyncInfo getDmpSyncInfo() {
        return dmpSyncInfo;
    }


    /**
     * Sets the dmpSyncInfo value for this BasicUserList.
     * 
     * @param dmpSyncInfo   * Information for streamlined user list upload workflow between
     * Google and DMP products.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DmpSyncInfo".</span>
     */
    public void setDmpSyncInfo(com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListSyncInfo dmpSyncInfo) {
        this.dmpSyncInfo = dmpSyncInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BasicUserList)) return false;
        BasicUserList other = (BasicUserList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.conversionTypes==null && other.getConversionTypes()==null) || 
             (this.conversionTypes!=null &&
              java.util.Arrays.equals(this.conversionTypes, other.getConversionTypes()))) &&
            ((this.dmpSyncInfo==null && other.getDmpSyncInfo()==null) || 
             (this.dmpSyncInfo!=null &&
              this.dmpSyncInfo.equals(other.getDmpSyncInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getConversionTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConversionTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConversionTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDmpSyncInfo() != null) {
            _hashCode += getDmpSyncInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BasicUserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "BasicUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "conversionTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "UserListConversionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmpSyncInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "dmpSyncInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DmpUserListSyncInfo"));
        elemField.setMinOccurs(0);
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
