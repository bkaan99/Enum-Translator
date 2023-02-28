package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author bkirmizigul
 */
public enum AcilVakaSonuc implements DbEnum {

    TEDAVI_ONERILERIYLE_CIKIS(1, "Tedavi Önerileriyle Çıkış"),
    TABURCU(2, "Taburcu (Yatan Hasta"),
    KURUM_ICINE_SEVK(3, "Kurum İçine Sevk"),
    KURUM_DISINA_SEVK(4, "Kurum Dışına Sevk"),
    TIBBI_ONERILERI_TEDAVILERI_REDDEDEREK_CIKIS(5, "Tıbbi Önerileri/Tedavileri Reddederek Çıkış"),
    OLUM(6, "Ölüm"),
    DIGER(7, "Diğer");

    private final Integer id;
    private final Serializable adi;

    AcilVakaSonuc(Integer id, Serializable adi) {
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
