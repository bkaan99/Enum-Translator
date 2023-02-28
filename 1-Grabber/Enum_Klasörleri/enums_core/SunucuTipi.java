package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozenturk
 */
public enum SunucuTipi implements DbEnum {
    
    HBYSSUNUCU(1, "HBYS Sunucu"),
    AGENTSUNUCU(2, "AGENT Sunucu");
    
    private final Integer id;
    private final Serializable adi;
    
    SunucuTipi(Integer id, Serializable adi) {
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
