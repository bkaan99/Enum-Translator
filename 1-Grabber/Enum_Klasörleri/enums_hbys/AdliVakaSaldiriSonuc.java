package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AdliVakaSaldiriSonuc implements DbEnum {

    GEREK_GORULMEDI(1, "Gerek görülmedi"),
    GEREK_GORULDU(2, "Gerek görüldü");
//    KESIN_RAPOR(3, "Kesin rapor"),
//    GECICI_RAPOR(4, "Geçici rapor");

    private final Integer id;
    private final Serializable adi;

    AdliVakaSaldiriSonuc(Integer id, Serializable adi) {
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
