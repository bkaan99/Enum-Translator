package tr.com.fonet.hbys.ris.ejb.rad.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum RisOrderRaporYazimDurum implements DbEnum {

    TUMU(-1, "Tümü"),
    RAPOR_YAZILMIS(1, "Yazılmış"),
    RAPOR_YAZILMAMIS(2, "Yazılmamış"),
    RAPOR_YAZILMIS_TASLAK(3, "Yazılmış (Taslak)"),
    RAPOR_YAZILMIS_ONAY(4, "Yazılmış (Onay)");

    private final Integer id;
    private final Serializable adi;

    RisOrderRaporYazimDurum(Integer id, Serializable adi) {
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
