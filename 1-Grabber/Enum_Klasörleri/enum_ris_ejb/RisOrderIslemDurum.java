package tr.com.fonet.hbys.ris.ejb.rad.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum RisOrderIslemDurum implements DbEnum {

    TUMU(-1, "Tümü"),
    KABUL_YAPILMIS(1, "Yapılanlar"),
    KABUL_YAPILMAMIS(2, "Yapılmayanlar"),
    CEKIM_ONAY_YAPILMIS(3, "Çekim Onay Yapılmış"),
    CEKIM_ONAY_YAPILMAMIS(4, "Çekim Onay Yapılmamış"),
    RAPOR_ONAY_YAPILMIS(5, "Rapor Onay Yapılmış"),
    RAPOR_ONAY_YAPILMAMIS(6, "Rapor Onay Yapılmamış");

    private final Integer id;
    private final Serializable adi;

    RisOrderIslemDurum(Integer id, Serializable adi) {
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
