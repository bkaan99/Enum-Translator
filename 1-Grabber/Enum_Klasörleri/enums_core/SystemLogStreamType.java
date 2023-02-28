package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum SystemLogStreamType implements DbEnum {
    
    NORMAL(1, "Normal loglar"),
    ERROR(2, "Hatalı loglar"),
    ALL(3, "Bütün loglar");
    
    private final Integer id;
    private final Serializable adi;
    
    SystemLogStreamType(Integer id, Serializable adi) {
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
