package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osmanumut
 */
public enum DinamikSorguSiralamaTuru implements DbEnum {
    
    ASC(1, "Artan"),
    DESC(2, "Azalan");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikSorguSiralamaTuru(Integer id, Serializable adi) {
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
