package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum MasterSistemBilgiTur implements DbEnum {

    VERITABANI_TABLO_BILGILERI(1, "VTYS Tablo Bilgileri"),
    VERITABANI_SEQUENCE_BILGILERI(2, "VTYS Sequence Bilgileri"),
    VERITABANI_VIEW_BILGILERI(3, "VTYS View Bilgileri"),
    VERITABANI_TABLO_KOLON_BILGILERI(4, "VTYS Tablo-Kolon Bilgileri"),
    VERITABANI_FONKSIYON_BILGILERI(5, "VTYS Fonksiyon Bilgileri"),
    VERITABANI_PACKAGE_BILGILERI(6, "VTYS Package Bilgileri"),
    VERITABANI_PACKAGE_BODY_BILGILERI(7, "VTYS Package Body Bilgileri"),
    VERITABANI_FOREIGN_KEY_BILGILERI(8, "VTYS Foreign  Key Bilgileri"),
    VERITABANI_PPROCEDURE_BILGILERI(9, "VTYS Procedure Bilgileri"),
    VERITABANI_SORGU(10, "VTYS Sorgu"),
    VERITABANI_KOLON_BILGILERI(11, "VTYS Kolon Bilgileri");



    private final Integer id;
    private final Serializable adi;

    MasterSistemBilgiTur(Integer id, Serializable adi) {
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

