package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.NClob;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum DataType implements DbEnum {
    UNDEFINDED_OBJECT(0, "Undefined Objecy",null,false,false,false,false,false,false,false),
    BOOLEAN(1, "boolean",boolean.class,false,false,false,false,false,false,true),
    BOOLEAN_NULL(2, "Boolean",Boolean.class,false,false,false,false,false,false,false),
    SHORT(3, "short",Short.class,false,false,false,false,false,false,true),
    SHORT_NULL(4, "Short",short.class,false,false,false,false,false,false,false),
    BYTE(5, "byte",byte.class,false,true,true,false,false,false,true),
    BYTE_NULL(6, "Byte",Byte.class,false,true,true,true,false,false,false),
    INTEGER(7, "int",int.class,false,true,true,false,false,false,true),
    INTEGER_NULL(8, "Integer",Integer.class,false,true,true,true,false,false,false),
    LONG(9, "long",long.class,false,true,true,false,false,false,true),
    LONG_NULL(10, "Long",Long.class,false,true,true,true,false,false,false),
    DOUBLE(11, "double",double.class,false,true,true,false,false,false,true),
    DOUBLE_NULL(12, "Double",Double.class,false,true,true,true,false,false,false),
    FLOAT(13, "float",float.class,false,true,true,false,false,false,true),
    FLOAT_NULL(14, "Float",Float.class,false,true,true,true,false,false,false),
    NUMBER(15, "Number",Number.class,false,true,true,true,false,false,false),
    CHARACTER(16, "char",char.class,false,false,false,true,false,false,true),
    CHARACTER_NULL(17, "Character",Character.class,false,false,true,true,false,false,false),
    CHAR_SEQUENCE(18, "CharSequence",CharSequence.class,false,false,true,false,false,false,false),
    STRING(19, "String",String.class,false,false,true,true,false,false,false),
    UUID(20, "UUID",UUID.class,false,false,true,true,false,false,false),
    UTIL_DATE(21, "UtilDate",null,false,false,true,true,true,false,false),
    SQL_DATE(22, "SqlData",java.sql.Date.class,false,false,true,true,true,true,false),
    CALENDAR(23, "Calendar",Calendar.class,false,false,true,true,true,false,false),
    TIME(24, "Time",Time.class,false,false,true,true,true,true,false),
    TIMESTAMP(25, "Timestamp",Timestamp.class,false,false,true,true,true,true,false),
    DBENUM(26, "DbEnum",DbEnum.class,true,false,true,true,false,false,false),
    ENUM(27, "Enum",Enum.class,true,false,true,true,false,false,false),
    BLOB(28, "Blob",Blob.class,false,false,true,false,false,true,false),
    CLOB(29, "Clob",Clob.class,false,false,true,false,false,true,false),
    NCLOB(30, "NClob",NClob.class,false,false,true,false,false,true,false),
    DOCUMENT(31, "Document",Document.class,false,false,true,false,false,false,false),
    JSONOBJECT(32, "JsonObject",JSONObject.class,false,false,true,false,false,false,false),
    JSONARRAY(33, "JsonArray",JSONArray.class, false,false,true,false,false,false,false),
    COLLECTION(34, "Collection",Collection.class,false,false,true,false,false,false,false),    
    MAP(35, "Map",Map.class,false,false,true,false,false,false,false),
    ARRAY(36, "Array",null,false,false,true,false,false,false,false),
    INTERFACE(37, "Interface",null,false,false,true,false,false,false,false),
    ANNOTATION(38, "Interface",null,false,false,true,false,false,false,false),
    VOID(38, "Interface",Void.class,false,false,true,false,false,false,false),
    OBJECT(39, "Object",Object.class,false,false,true,false,false,false,false);
    
    
    private final boolean enumType;
    private final boolean number;
    private final boolean nullable;
    private final boolean value;
    private final boolean date;
    private final boolean sqlType;
    private final boolean primitive;
    private final Integer id;
    private final Serializable adi;
    private final Class<?> clazz;
    
/**
 * 
 * @param id
 * @param adi
 * @param number isNumber
 * @param nullable isNullable
 * @param value isValue
 * @param date isDate
 * @param sqlType  isSqlType
 */
    private DataType(Integer id, Serializable adi,Class<?> clazz, boolean enumType,boolean number, boolean nullable, boolean value, boolean date,boolean sqlType,boolean primitive) {
        this.id = id;
        this.adi = adi;
        this.clazz = clazz;
        this.enumType = enumType;
        this.number = number;
        this.nullable = nullable;
        this.value = value;
        this.date = date;
        
        this.sqlType = sqlType;
        this.primitive = primitive;
        
    }
    
    
    @Override
    public Serializable getAdi() {
        return adi;
    }
    
    @Override
    public Integer getId() {
        return id;
    }

    public boolean isEnumType() {
        return enumType;
    }

    public boolean isNumber() {
        return number;
    }

    public boolean isNullable() {
        return nullable;
    }

    public boolean isValue() {
        return value;
    }

    public boolean isDate() {
        return date;
    }

    public boolean isSqlType() {
        return sqlType;
    }

    public boolean isPrimitive() {
        return primitive;
    }

    public Class<?> getClazz() {
        return clazz;
    }
    

   
     
}
