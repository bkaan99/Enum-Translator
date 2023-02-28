package tr.com.fonet.hbys.ris.ejb.rad.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum RisOrderHastaTuru implements DbEnum {

    TUMU(-1, "Tümü"),
    ACIL(1, "Acil Hastalar"),
    AYAKTAN(2, "Ayaktan Hastalar"),
    YATAN(3, "Yatan Hastalar"),
    ACIL_VEYA_YATAN(4, "Acil veya Yatan Hastalar"),
    ADLI_VAKA(5, "Adli Vaka Hastaları"),
    POLIKLINIK(6, "Poliklinik Hastaları"),
    ACIL_VEYA_YATAN_DEGIL(7, "Acil veya Yatan Olmayan Hastalar");

    private final Integer id;
    private final Serializable adi;

    RisOrderHastaTuru(Integer id, Serializable adi) {
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
