/**
 * FunctionOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;

public class FunctionOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FunctionOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IN = "IN";
    public static final java.lang.String _IDENTITY = "IDENTITY";
    public static final java.lang.String _EQUALS = "EQUALS";
    public static final java.lang.String _AND = "AND";
    public static final java.lang.String _CONTAINS_ANY = "CONTAINS_ANY";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FunctionOperator IN = new FunctionOperator(_IN);
    public static final FunctionOperator IDENTITY = new FunctionOperator(_IDENTITY);
    public static final FunctionOperator EQUALS = new FunctionOperator(_EQUALS);
    public static final FunctionOperator AND = new FunctionOperator(_AND);
    public static final FunctionOperator CONTAINS_ANY = new FunctionOperator(_CONTAINS_ANY);
    public static final FunctionOperator UNKNOWN = new FunctionOperator(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FunctionOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FunctionOperator enumeration = (FunctionOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FunctionOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FunctionOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "Function.Operator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
