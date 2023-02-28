package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mxxyalcinkaya
 */
public enum HttpMethodParameterType implements DbEnum {
    
    PATH_PARAM(1, "Path Param"),
    QUERY_PARAM(2, "Query Param"),
    JSON(3, "Json"),
    XML(4, "Xml");
    
    private final Integer id;
    private final Serializable adi;
    
    HttpMethodParameterType(Integer id, Serializable adi) {
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
