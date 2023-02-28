package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum MarketYorumTur implements DbEnum {
    
    PUAN(1, "Puan"),
    YORUM(2, "Yorum");
    
    private final Integer id;
    private final Serializable adi;
    
    MarketYorumTur(Integer id, Serializable adi) {
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
