package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum InteraktifSmsAyarParameteYon implements DbEnum {
    
    GIDEN(1, "Giden Parametre"),
    DONEN(2, "Dönüş Paremeresi");
    
    private final Integer id;
    private final Serializable adi;
    
    InteraktifSmsAyarParameteYon(Integer id, Serializable adi) {
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
