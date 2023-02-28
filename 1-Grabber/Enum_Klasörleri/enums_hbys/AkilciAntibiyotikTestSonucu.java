package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public enum AkilciAntibiyotikTestSonucu implements DbEnum {

    BELIRTILMEMIS(0, "Belirtilmemiş"),
    NEGATIF(1, "Negatif"),
    POZITIF(2, "Pozitif");

    private final Integer id;
    private final Serializable adi;

    AkilciAntibiyotikTestSonucu(Integer id, Serializable adi) {
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
