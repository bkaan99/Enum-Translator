package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaTendonRefleksi implements DbEnum {

    NORMOAKTIF(1, "Normoaktif"),
    HIPERAKTIF(2, "Hiperaktif"),
    HIPOAKTIF(3, "Hipoaktif");
    
    private final Integer id;
    private final Serializable adi;
    
    AdliVakaTendonRefleksi(Integer id, Serializable adi) {
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
