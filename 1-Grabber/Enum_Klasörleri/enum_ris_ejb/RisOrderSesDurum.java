package tr.com.fonet.hbys.ris.ejb.rad.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum RisOrderSesDurum implements DbEnum {

    TUMU(-1, "Tümü"),
    SES_KAYDI_VAR(1, "Var"),
    SES_KAYDI_YOK(2, "Yok");

    private final Integer id;
    private final Serializable adi;

    RisOrderSesDurum(Integer id, Serializable adi) {
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
