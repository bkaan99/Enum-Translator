package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osmanumut
 */
public enum DinamikSorguIslemTur implements DbEnum {
    
    EKRAN(1, "Ekran"),
    SERVIS(2, "Servis");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikSorguIslemTur(Integer id, Serializable adi) {
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
