package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleGDBilincDurumu implements DbEnum {
    
    IYI(1, "İyi"),
    ORTA(2, "Orta"),
    KOTU(3,"Kötü");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleGDBilincDurumu(Integer id, Serializable adi) {
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
