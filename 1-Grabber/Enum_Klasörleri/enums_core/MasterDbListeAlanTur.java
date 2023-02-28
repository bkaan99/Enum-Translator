package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum MasterDbListeAlanTur implements DbEnum {
    
    VARCHAR(1, "VARCHAR"),
    DATE(2, "DATE"),
    NUMBER(3, "NUMBER"),
    DECIMAL(4, "DECIMAL"),
    TIMESTAMP(5, "TIMESTAMP"),
    CLOB(6, "CLOB"),
    READONLY(7, "READONLY");
    
    private final Integer id;
    private final Serializable adi;
    
    MasterDbListeAlanTur(Integer id, Serializable adi) {
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
