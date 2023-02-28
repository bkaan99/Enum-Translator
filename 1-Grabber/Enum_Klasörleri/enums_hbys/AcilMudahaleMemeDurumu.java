package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleMemeDurumu implements DbEnum {
    
    MEMEDE_AGRI(1,"Memede ağrı"),
    MEMEDE_AKINTI(2, "Memede akıntı"),
    MEMEDE_KITLE(3, "Memede kitle");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleMemeDurumu(Integer id, Serializable adi) {
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
