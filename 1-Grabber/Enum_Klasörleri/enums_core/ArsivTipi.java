package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum ArsivTipi implements DbEnum {
    
    Gizli(1, "Arşivlenmeyecek Belgeler"),
    Arsiv(2, "Arşivlenecek Belgeler");
    
    
    private final Integer id;
    private final Serializable adi;
    
    ArsivTipi(Integer id, Serializable adi) {
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
