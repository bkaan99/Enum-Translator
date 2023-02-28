package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osmanumut
 */
public enum DinamikSorguTipi implements DbEnum {
    
    FONET(1, "Fonet"),
    KHB(2, "KHB"),
    KURUM(3,"Kurum"),
    API(4,"Api");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikSorguTipi(Integer id, Serializable adi) {
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
