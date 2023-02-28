package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum TimerJobType implements DbEnum {
    
    TEK_SEFERLIK(1, "Tek Seferlik"),
    GUNLUK(2, "Günlük"),
    HAFTALIK(3, "Haftalık"),
    AYLIK(4, "Aylık"),
    YILLIK(5, "Yıllık");
    
    
    private final Integer id;
    private final Serializable adi;
    
    TimerJobType(Integer id, Serializable adi) {
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
