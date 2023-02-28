package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum InteraktifYonetimKanali implements DbEnum {

    TELEFON(1, "Telefon"),
    MAIL(2, "Mail"),
    MEKTUP(3, "Mektup");

    private final Integer id;

    private final Serializable adi;

    InteraktifYonetimKanali(Integer id, Serializable adi) {
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
