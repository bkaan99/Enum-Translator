package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum LogOutputType implements DbEnum {
    
    CONSOLE(1, "Ekrana gostermek için"),
    FILE(2, "Dosyaya gostermek için"),
    NET(3, "Sockete gostermek için"),
    DB(4, "Database'a kaydetmek içim");
    
    private final Integer id;
    private final Serializable adi;
    
    LogOutputType(Integer id, Serializable adi) {
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
