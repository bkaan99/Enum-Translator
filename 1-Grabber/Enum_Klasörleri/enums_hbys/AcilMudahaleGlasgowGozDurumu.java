package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleGlasgowGozDurumu implements DbEnum {
    
    GOZLERINI_ACMIYOR(1, "Gözlerini açmıyor"),
    AGRILI_UYARANA_ACAR(2, "Ağrılı uyarana açar"),
    SOZEL_UYARANA_ACAR(3,"Sözel uyarana açar"),
    SPONTAN_ACIK(4,"Spontan açık");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleGlasgowGozDurumu(Integer id, Serializable adi) {
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
