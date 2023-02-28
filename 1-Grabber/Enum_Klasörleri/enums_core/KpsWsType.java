package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author muysal
 */
public enum KpsWsType implements DbEnum {
    
    SAGLIK(1, "Sağlık Bakanlığı"),
    NVI(2, "Nüfus");
    
    private final Integer id;
    private final Serializable adi;
    
    KpsWsType(Integer id, Serializable adi) {
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
