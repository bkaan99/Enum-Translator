package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaBulunanKisi2 implements DbEnum {
    
    KOLLUK_KUVVETI_MUAYENE_EDILENIN_MUDAFII(1,"Kolluk kuvveti muayene edilenin müdafii"),
    KOLLUK_KUVVETI(2,"Kolluk kuvveti");
    
    private final Integer id;
    private final Serializable adi;
    
    AdliVakaBulunanKisi2(Integer id, Serializable adi) {
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
