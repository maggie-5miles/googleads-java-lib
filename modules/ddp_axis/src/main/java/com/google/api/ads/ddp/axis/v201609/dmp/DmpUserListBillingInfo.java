/**
 * DmpUserListBillingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201609.dmp;


/**
 * Information for Google billing advertisers on behalf of DMP's for
 * user list creations
 */
public class DmpUserListBillingInfo  implements java.io.Serializable {
    /* The number of billable records (e.g. uploaded or matched).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long billableRecordCount;

    /* The transaction time for this billable event.
     *                 
     *                 <p>This is set by Google services when a billableRecordCount
     * is added.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String transactionTimestamp;

    public DmpUserListBillingInfo() {
    }

    public DmpUserListBillingInfo(
           java.lang.Long billableRecordCount,
           java.lang.String transactionTimestamp) {
           this.billableRecordCount = billableRecordCount;
           this.transactionTimestamp = transactionTimestamp;
    }


    /**
     * Gets the billableRecordCount value for this DmpUserListBillingInfo.
     * 
     * @return billableRecordCount   * The number of billable records (e.g. uploaded or matched).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getBillableRecordCount() {
        return billableRecordCount;
    }


    /**
     * Sets the billableRecordCount value for this DmpUserListBillingInfo.
     * 
     * @param billableRecordCount   * The number of billable records (e.g. uploaded or matched).
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setBillableRecordCount(java.lang.Long billableRecordCount) {
        this.billableRecordCount = billableRecordCount;
    }


    /**
     * Gets the transactionTimestamp value for this DmpUserListBillingInfo.
     * 
     * @return transactionTimestamp   * The transaction time for this billable event.
     *                 
     *                 <p>This is set by Google services when a billableRecordCount
     * is added.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getTransactionTimestamp() {
        return transactionTimestamp;
    }


    /**
     * Sets the transactionTimestamp value for this DmpUserListBillingInfo.
     * 
     * @param transactionTimestamp   * The transaction time for this billable event.
     *                 
     *                 <p>This is set by Google services when a billableRecordCount
     * is added.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTransactionTimestamp(java.lang.String transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DmpUserListBillingInfo)) return false;
        DmpUserListBillingInfo other = (DmpUserListBillingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billableRecordCount==null && other.getBillableRecordCount()==null) || 
             (this.billableRecordCount!=null &&
              this.billableRecordCount.equals(other.getBillableRecordCount()))) &&
            ((this.transactionTimestamp==null && other.getTransactionTimestamp()==null) || 
             (this.transactionTimestamp!=null &&
              this.transactionTimestamp.equals(other.getTransactionTimestamp())));
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
        if (getBillableRecordCount() != null) {
            _hashCode += getBillableRecordCount().hashCode();
        }
        if (getTransactionTimestamp() != null) {
            _hashCode += getTransactionTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DmpUserListBillingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DmpUserListBillingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billableRecordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "billableRecordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "transactionTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
