package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

public enum AyTuru implements DbEnum {
    MILADI(0, "Miladi"),
    RUMI(1, "Rumi"),
    HICRI(2, "Hicri");
    private final Integer id;
    private final Serializable adi;

    AyTuru(Integer id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

}
