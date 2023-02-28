package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum RaporSablonTipi implements DbEnum {
    
    TITLE(1, "Title"),
    SUBREPORT(2, "Subreport"),
    FOOTER(3, "Footer"),
    DETAIL(4, "Detail"),  
    TEMPLATE(5, "Template");   
    
    
    
    private final Integer id;
    private final Serializable adi;
    
    RaporSablonTipi(Integer id, Serializable adi) {
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
