package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleHavaYoluDurumu implements DbEnum {
    
    SPONTAN(1, "Spontan"),
    MASKE(2, "Maske"),
    NAZAL_KANUL(3, "Nazal Kanül"),
    AIRWAY(4, "Airway"),
    ENTUBE(5, "Entübe");
        
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleHavaYoluDurumu(Integer id, Serializable adi) {
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
