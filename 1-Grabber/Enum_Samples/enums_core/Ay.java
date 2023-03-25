package tr.com.core.common.enums;

import java.io.Serializable;
import tr.com.core.common.enums.base.DbEnum;

public enum Ay implements DbEnum {

    OCAK(1, "Ocak"),
    SUBAT(2, "Şubat"),
    MART(3, "Mart"),
    NISAN(4, "Nisan"),
    MAYIS(5, "Mayıs"),
    HAZIRAN(6, "Haziran"),
    TEMMUZ(7, "Temmuz"),
    AGUSTOS(8, "Ağustos"),
    EYLUL(9, "Eylül"),
    EKIM(10, "Ekim"),
    KASIM(11, "Kasım"),
    ARALIK(12, "Aralık");
    private final Integer id;
    private final Serializable adi;

    Ay(Integer id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

}
