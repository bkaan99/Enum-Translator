package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum HastaTipi implements DbEnum {

    ASKER(1, "Asker"),
    SIVIL(2, "Sivil"),
    DIGER(3, "Diğer");

    private final Integer id;
    private final Serializable adi;

    HastaTipi(Integer id, Serializable adi) {
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
