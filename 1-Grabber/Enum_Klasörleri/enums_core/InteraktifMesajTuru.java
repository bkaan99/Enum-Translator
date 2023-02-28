package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author oozgur
 */
public enum InteraktifMesajTuru implements DbEnum {

    MESAJ(1, "Mesaj"),
    DUYURU(2, "Duyuru"),
    DOGUM_GUNU(3, "Dogum Gunu");

    private final Integer id;
    private final Serializable adi;

    InteraktifMesajTuru(Integer id, Serializable adi) {
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
