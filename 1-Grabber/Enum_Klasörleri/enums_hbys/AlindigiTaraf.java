package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sarslan
 */
public enum AlindigiTaraf implements DbEnum {

    ASAGI(1, "Aşağı"),
    YUKARI(2, "Yukarı"),
    ORTA(3, "Orta");

    private final Integer id;
    private final Serializable adi;

    AlindigiTaraf(Integer id, Serializable adi) {
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
