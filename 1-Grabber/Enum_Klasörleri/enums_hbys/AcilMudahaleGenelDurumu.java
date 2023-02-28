package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleGenelDurumu implements DbEnum {
    ATES(1,"Ateş"),
    HALSIZLIK(2,"Halsizlik"),
    ISTAHSIZLIK(3,"İştahsızlık"),
    KILO_KAYBI(4, "Kilo kaybı"),
    TERLEME(5, "Terleme");
   
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleGenelDurumu(Integer id, Serializable adi) {
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
