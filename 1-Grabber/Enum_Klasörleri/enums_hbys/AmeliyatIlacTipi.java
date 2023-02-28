package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum AmeliyatIlacTipi implements DbEnum {

    ANESTEZIK(1, "Anestezik İlaçlar"),
    SIVI_VE_INF(2, "IV. SIVI ve INF."),
    DIGER(3, "Diğer İlaçlar")
    ;

    private final Integer id;
    private final Serializable adi;

    AmeliyatIlacTipi(Integer id, Serializable adi) {
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
