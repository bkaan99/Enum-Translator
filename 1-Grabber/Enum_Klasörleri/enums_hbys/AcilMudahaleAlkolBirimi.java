package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleAlkolBirimi implements DbEnum {
    
    PROMIL(1, "Promil"),
    MG_DL(2, "mg/dL");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleAlkolBirimi(Integer id, Serializable adi) {
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
