package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaIsikRefleksi implements DbEnum {

    ARTI_ARTI(1, "+/+"),
    EKSI_ARTI(2, "-/+"),
    ARTI_EKSI(3, "+/-"),
    EKSI_EKSI(4, "-/-");
    
    private final Integer id;
    private final Serializable adi;
    
    AdliVakaIsikRefleksi(Integer id, Serializable adi) {
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
