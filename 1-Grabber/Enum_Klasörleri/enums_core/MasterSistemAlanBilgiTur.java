package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author oozgur
 */
public enum MasterSistemAlanBilgiTur implements DbEnum {

    ALAN_EKLEME(1, "Alan Ekleme"),
    ALAN_GUNCELEME(2, "Alan Güncelleme"),
    ALAN_SILME(3, "Alan Silme"),
    YENI_TABLO(4, "Yeni Tablo");



    private final Integer id;
    private final Serializable adi;

    MasterSistemAlanBilgiTur(Integer id, Serializable adi) {
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

