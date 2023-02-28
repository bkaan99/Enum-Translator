package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osman
 */
public enum SecimListeTuru implements DbEnum {
    
    CORE(1, "Core Select List"),
    HBYS(2, "HBYS Select List");
    
    private final Integer id;
    private final Serializable adi;
    
    SecimListeTuru(Integer id, Serializable adi) {
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
