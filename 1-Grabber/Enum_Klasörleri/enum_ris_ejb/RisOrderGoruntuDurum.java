package tr.com.fonet.hbys.ris.ejb.rad.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum RisOrderGoruntuDurum implements DbEnum {

    TUMU(-1, "Tümü"),
    PACS_GORUNTUSU_VAR(1, "Var"),
    PACS_GORUNTUSU_YOK(2, "Yok");

    private final Integer id;
    private final Serializable adi;

    RisOrderGoruntuDurum(Integer id, Serializable adi) {
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
