package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author muysal
 */
public enum AjandaNotTuru implements DbEnum {
    
    RANDEVU(1, "Randevu"),
    GOREV(2, "Görev"),
    DOGUM_GUNU(3, "Doğum Günü"),
    YIL_DONUMU(4, "Yıl Dönümü"),
    DIGER(5, "Diğer");
    
    private final Integer id;
    private final Serializable adi;
    
    AjandaNotTuru(Integer id, Serializable adi) {
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
