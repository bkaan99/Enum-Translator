package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author yyilmaz
 */
public enum ParolaZorlukDerecesi implements DbEnum {
    BASIT_PAROLA(1, "Basit Parola"),
    GUCLU_PAROLA(2, "Güçlü Parola");
    
    private final Integer id;
    private final Serializable adi;
    
    ParolaZorlukDerecesi(Integer id, Serializable adi) {
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