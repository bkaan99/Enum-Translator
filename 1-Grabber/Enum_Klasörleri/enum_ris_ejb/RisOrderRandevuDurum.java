package tr.com.fonet.hbys.ris.ejb.rad.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum RisOrderRandevuDurum implements DbEnum {

    TUMU(-1, "Tümü"),
    RANDEVU_VERILMIS(1, "Verilmiş"),
    RANDEVU_VERILMEMIS(2, "Verilmemiş");

    private final Integer id;
    private final Serializable adi;

    RisOrderRandevuDurum(Integer id, Serializable adi) {
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
