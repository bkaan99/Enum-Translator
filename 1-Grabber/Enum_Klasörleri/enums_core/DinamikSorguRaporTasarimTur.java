package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osmanumut
 */
public enum DinamikSorguRaporTasarimTur implements DbEnum {
    
    LISTE(1, "Liste"),
    FORM(2, "Form");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikSorguRaporTasarimTur(Integer id, Serializable adi) {
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
