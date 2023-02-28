package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum CalismaDurumu implements DbEnum {
    
    CALISIYOR(1, "Çalışıyor"),
    CALISMIYOR(2, "Çalışmıyor");
    
    private final Integer id;
    private final Serializable adi;
    
    CalismaDurumu(Integer id, Serializable adi) {
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
