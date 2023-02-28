package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum AltUst implements DbEnum {

    ALT(1, "ALT"),
    UST(2, "ÜST");

    private final Integer id;
    private final Serializable adi;

    AltUst(Integer id, Serializable adi) {
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
