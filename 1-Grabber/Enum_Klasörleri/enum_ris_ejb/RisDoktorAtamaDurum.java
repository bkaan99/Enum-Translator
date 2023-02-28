package tr.com.fonet.hbys.ris.ejb.rad.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum RisDoktorAtamaDurum implements DbEnum {

    TUMU(-1, "Tümü"),
    ATANMAMIS(1, "Atanmamış"),
    DOKTOR_ATANMIS(2, "Doktor atanmış"),
    RAPORTOR_DOKTOR_ATANMIS(3, "Raportör doktor atanmış");

    private final Integer id;
    private final Serializable adi;

    RisDoktorAtamaDurum(Integer id, Serializable adi) {
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
