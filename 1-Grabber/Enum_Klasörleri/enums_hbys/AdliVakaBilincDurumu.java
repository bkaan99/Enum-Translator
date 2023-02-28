package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaBilincDurumu implements DbEnum {

    YOK(0,"Yok"),
    ACIK(1, "Açık"),
    UYKUYA_MAILLI(2, "Uykuya Meyilli"),
    KAPALI(3, "Kapalı");

    private final Integer id;
    private final Serializable adi;
    
    AdliVakaBilincDurumu(Integer id, Serializable adi) {
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
