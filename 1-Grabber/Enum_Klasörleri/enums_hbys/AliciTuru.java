package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author selim.surucu
 */
public enum AliciTuru implements DbEnum {

    STATIK(1, "Statik"),
    DINAMIK(2, "Dinamik");

    private final Integer id;
    private final Serializable adi;

    AliciTuru(Integer id, Serializable adi) {
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
