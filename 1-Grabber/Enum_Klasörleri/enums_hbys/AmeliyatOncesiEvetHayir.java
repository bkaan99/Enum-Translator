package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum AmeliyatOncesiEvetHayir implements DbEnum {

    HAYIR(0, "Hayır"),
    EVET(1, "Evet"),
    BELIRTILMEDI(2, "Belirtilmedi");

    private final Integer id;
    private final Serializable adi;

    AmeliyatOncesiEvetHayir(Integer id, Serializable adi) {
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
