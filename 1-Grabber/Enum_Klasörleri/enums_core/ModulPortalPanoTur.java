package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum ModulPortalPanoTur implements DbEnum {

    PORTAL(1, "Portal"),
    HBYS_FORMU(2, "HBYS Formu"),
    VERSIYON_BILGILERI(3, "Versiyon Bilgileri"),
    DINAMIK_ISTATISTIK(4, "Dinamik İstatistik");

    private final Integer id;
    private final Serializable adi;

    ModulPortalPanoTur(Integer id, Serializable adi) {
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
