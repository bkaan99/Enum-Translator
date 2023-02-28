package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikSorguKontrolDurum implements DbEnum {
    
    TASLAK(1, "Taslak"),
    ONAY(2, "Onay");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikSorguKontrolDurum(Integer id, Serializable adi) {
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
