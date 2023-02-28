package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author bozcan
 */
public enum NegatifPozitif implements DbEnum {
    
    NEGATIF(1, "Negatif"),
    POZITIF(2, "Pozitif");
    
    
    private final Integer id;
    private final Serializable adi;
    
    NegatifPozitif(Integer id, Serializable adi) {
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
