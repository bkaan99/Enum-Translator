package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum AmeliyatOdasinaAlmaTipi implements DbEnum {

    RANDEVU(1, "Randevu"),
    GECE_ACIL(2, "Gece Acil"),
    GUNDUZ_ACIL(3, "Gündüz Acil");

    private final Integer id;
    private final Serializable adi;

    AmeliyatOdasinaAlmaTipi(Integer id, Serializable adi) {
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
