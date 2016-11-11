/**
 * DmpUserListSyncStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201609.dmp;

public class DmpUserListSyncStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DmpUserListSyncStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _CREATED = "CREATED";
    public static final java.lang.String _READY_FOR_USE = "READY_FOR_USE";
    public static final java.lang.String _FAILURE = "FAILURE";
    public static final DmpUserListSyncStatus UNKNOWN = new DmpUserListSyncStatus(_UNKNOWN);
    public static final DmpUserListSyncStatus CREATED = new DmpUserListSyncStatus(_CREATED);
    public static final DmpUserListSyncStatus READY_FOR_USE = new DmpUserListSyncStatus(_READY_FOR_USE);
    public static final DmpUserListSyncStatus FAILURE = new DmpUserListSyncStatus(_FAILURE);
    public java.lang.String getValue() { return _value_;}
    public static DmpUserListSyncStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DmpUserListSyncStatus enumeration = (DmpUserListSyncStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DmpUserListSyncStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DmpUserListSyncStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201609", "DmpUserListSyncStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
