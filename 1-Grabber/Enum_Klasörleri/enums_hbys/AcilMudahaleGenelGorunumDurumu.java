package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleGenelGorunumDurumu implements DbEnum {
    
    NORMAL(1, "Normal"), 
    HIPEREMIK(2,"Hiperemik"),
    IKTERIK(3,"İkterik"),
    PANIK(4,"Panik"),
    SOLUK(5, "Soluk"),
    SIYANOTIK(6,"Siyanotik"),
    TERLI(7,"Terli"),
    DIGER(8,"Diğer");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleGenelGorunumDurumu(Integer id, Serializable adi) {
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
