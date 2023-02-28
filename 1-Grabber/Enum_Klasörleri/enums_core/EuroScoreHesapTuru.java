package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;
import tr.com.fonet.core.common.utils.NumberUtils;

import java.io.Serializable;

public enum EuroScoreHesapTuru implements DbEnum {

    STANDARD(0, "Standard"),
    LOJISTIK(1, "Lojistik");

    private final Integer id;
    private final Serializable adi;

    EuroScoreHesapTuru(Integer id, Serializable adi) {
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

    public Integer getIntId() {
        return NumberUtils.createInteger(id);
    }
}
