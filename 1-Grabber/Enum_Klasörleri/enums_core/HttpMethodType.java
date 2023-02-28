package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mxxyalcinkaya
 */
public enum HttpMethodType implements DbEnum {
    
    GET(1, "GET"),
    POST(2, "POST"),
    PUT(3, "PUT"),
    DELETE(4, "DELETE"),
    HEAD(5, "HEAD"),
    OPTIONS(6, "OPTIONS"),
    PATCH(7, "PATCH");
    
    private final Integer id;
    private final Serializable adi;
    
    HttpMethodType(Integer id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }
    
    @Override
    public Serializable getAdi() {
        return adi;
    }
    
    @Override
    public Integer getId() {
        return id;
    }
}
