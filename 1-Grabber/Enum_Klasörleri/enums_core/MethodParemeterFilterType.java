package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum MethodParemeterFilterType implements DbEnum {
    
    NULLABLE(1, "Null olabilir"),
    MIN_VALUE(2, "En düşük değer"),
    MAX_VALUE(3, "En büyük değer"),
    MIN_LENGTH(4, "Max Uzunluk"),
    MAX_LENGTH(5, "Max Uzunluk");
    
    
    private final Integer id;
    private final Serializable adi;
    
    MethodParemeterFilterType(Integer id, Serializable adi) {
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
