package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikSecimListeTur implements DbEnum {
    
    CORE(1, "Core"),
    HBYS(2, "HBYS");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikSecimListeTur(Integer id, Serializable adi) {
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
