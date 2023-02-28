package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author sgozmen
 */
public enum OnayDurumu implements DbEnum {
    
    ONAY_BEKLIYOR(0, "Onay Bekliyor"),
    ONAYLANDI(1, "Onaylandı"),
    RED_EDILDI(2, "Red Edildi");
    
    private final Integer id;
    private final Serializable adi;
    
    OnayDurumu(Integer id, Serializable adi) {
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
