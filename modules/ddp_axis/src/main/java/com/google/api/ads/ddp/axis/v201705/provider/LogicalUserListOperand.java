/**
 * LogicalUserListOperand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201705.provider;


/**
 * An interface for a logical user list operand. A logical user list
 * is a
 *             combination of logical rules. Each rule is defined as
 * a logical operator and
 *             a list of operands. Those operands can be of type UserList.
 */
public class LogicalUserListOperand  implements java.io.Serializable {
    private com.google.api.ads.ddp.axis.v201705.provider.UserList userList;

    public LogicalUserListOperand() {
    }

    public LogicalUserListOperand(
           com.google.api.ads.ddp.axis.v201705.provider.UserList userList) {
           this.userList = userList;
    }


    /**
     * Gets the userList value for this LogicalUserListOperand.
     * 
     * @return userList
     */
    public com.google.api.ads.ddp.axis.v201705.provider.UserList getUserList() {
        return userList;
    }


    /**
     * Sets the userList value for this LogicalUserListOperand.
     * 
     * @param userList
     */
    public void setUserList(com.google.api.ads.ddp.axis.v201705.provider.UserList userList) {
        this.userList = userList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogicalUserListOperand)) return false;
        LogicalUserListOperand other = (LogicalUserListOperand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userList==null && other.getUserList()==null) || 
             (this.userList!=null &&
              this.userList.equals(other.getUserList())));
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
        if (getUserList() != null) {
            _hashCode += getUserList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogicalUserListOperand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201705", "LogicalUserListOperand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201705", "UserList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201705", "UserList"));
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
