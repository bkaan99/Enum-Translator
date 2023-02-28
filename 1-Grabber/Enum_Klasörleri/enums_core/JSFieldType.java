package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum JSFieldType implements DbEnum {

    AUTO("AUTO", "AUTO", "AUTO"),
    STRING("STRING", "STRING", "STRING"),
    INT("INT", "INT", "INT"),
    FLOAT("FLOAT", "FLOAT", "FLOAT"),
    BOOL("BOOL", "BOOL", "BOOL"),
    DATE("DATE", "DATE", "DATE");

    private final Serializable id;
    private final Serializable adi;
    private final Serializable jsType;

    JSFieldType(Serializable id, Serializable adi, Serializable jsType) {
        this.id = id;
        this.adi = adi;
        this.jsType = jsType;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

    @Override
    public Serializable getId() {
        return id;
    }

    public Serializable getJSType() {
        return jsType;
    }
}
