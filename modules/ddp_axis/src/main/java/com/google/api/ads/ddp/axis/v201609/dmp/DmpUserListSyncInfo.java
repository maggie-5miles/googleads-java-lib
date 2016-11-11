/**
 * DmpUserListSyncInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201609.dmp;


/**
 * Optional information about a DMP sync'ing list data to Google.
 */
public class DmpUserListSyncInfo  implements java.io.Serializable {
    /* Status of DMP syncing list information to Google. */
    private com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListSyncStatus syncStatus;

    /* Information for Google billing customers on behalf of DMPs
     * creating lists.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 1.</span> */
    private com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListBillingInfo[] billingInfo;

    public DmpUserListSyncInfo() {
    }

    public DmpUserListSyncInfo(
           com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListSyncStatus syncStatus,
           com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListBillingInfo[] billingInfo) {
           this.syncStatus = syncStatus;
           this.billingInfo = billingInfo;
    }


    /**
     * Gets the syncStatus value for this DmpUserListSyncInfo.
     * 
     * @return syncStatus   * Status of DMP syncing list information to Google.
     */
    public com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListSyncStatus getSyncStatus() {
        return syncStatus;
    }


    /**
     * Sets the syncStatus value for this DmpUserListSyncInfo.
     * 
     * @param syncStatus   * Status of DMP syncing list information to Google.
     */
    public void setSyncStatus(com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListSyncStatus syncStatus) {
        this.syncStatus = syncStatus;
    }


    /**
     * Gets the billingInfo value for this DmpUserListSyncInfo.
     * 
     * @return billingInfo   * Information for Google billing customers on behalf of DMPs
     * creating lists.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 1.</span>
     */
    public com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListBillingInfo[] getBillingInfo() {
        return billingInfo;
    }


    /**
     * Sets the billingInfo value for this DmpUserListSyncInfo.
     * 
     * @param billingInfo   * Information for Google billing customers on behalf of DMPs
     * creating lists.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 1.</span>
     */
    public void setBillingInfo(com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListBillingInfo[] billingInfo) {
        this.billingInfo = billingInfo;
    }

    public com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListBillingInfo getBillingInfo(int i) {
        return this.billingInfo[i];
    }

    public void setBillingInfo(int i, com.google.api.ads.ddp.axis.v201609.dmp.DmpUserListBillingInfo _value) {
        this.billingInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DmpUserListSyncInfo)) return false;
        DmpUserListSyncInfo other = (DmpUserListSyncInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.syncStatus==null && other.getSyncStatus()==null) || 
             (this.syncStatus!=null &&
              this.syncStatus.equals(other.getSyncStatus()))) &&
            ((this.billingInfo==null && other.getBillingInfo()==null) || 
             (this.billingInfo!=null &&
              java.util.Arrays.equals(this.billingInfo, other.getBillingInfo())));
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
        if (getSyncStatus() != null) {
            _hashCode += getSyncStatus().hashCode();
        }
        if (getBillingInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingInfo(), i);
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
        new org.apache.axis.description.TypeDesc(DmpUserListSyncInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DmpUserListSyncInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "syncStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DmpUserListSyncStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "billingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DmpUserListBillingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
