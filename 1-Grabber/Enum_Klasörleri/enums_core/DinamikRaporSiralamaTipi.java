package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mustafa.kus
 */
public enum DinamikRaporSiralamaTipi implements DbEnum {
    
    ASCENDING("ASCENDING", "Artan"),
    DESCENDING("DESCENDING", "Azalan");
    
    private final Serializable id;
    private final Serializable adi;
    
    DinamikRaporSiralamaTipi(Serializable id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }
    
    @Override
    public Serializable getAdi() {
        return adi;
    }
    
    @Override
    public Serializable getId() {
        return id;
    }
}
