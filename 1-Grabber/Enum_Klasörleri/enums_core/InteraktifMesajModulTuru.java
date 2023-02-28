package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum InteraktifMesajModulTuru implements DbEnum {
    LABORATUVAR(1, "Laboratuvar"),
    DIGER(2, "Diğer");

    private final Integer id;
    private final Serializable adi;

    InteraktifMesajModulTuru(Integer id, Serializable adi) {
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
