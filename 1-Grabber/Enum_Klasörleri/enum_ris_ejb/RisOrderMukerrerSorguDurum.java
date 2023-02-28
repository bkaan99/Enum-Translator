package tr.com.fonet.hbys.ris.ejb.rad.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum RisOrderMukerrerSorguDurum implements DbEnum {

    TUMU(-1, "Tümü"),
    SORGU_YAPILMAMIS(1, "Mükerrerlik Sorgusu yapılmamış"),
    SORGU_YAPILMIS_ACILMAMIS(2, "Mükerrerlik Sorgusu yapılmış,Rapor-Görüntü Açılmamış"),
    SORGU_YAPILMIS_ACILMIS(3, "Mükerrerlik Sorgusu yapılmış,Rapor-Görüntü Açılmış");

    private final Integer id;
    private final Serializable adi;

    RisOrderMukerrerSorguDurum(Integer id, Serializable adi) {
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
