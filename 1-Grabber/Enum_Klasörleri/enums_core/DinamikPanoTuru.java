package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author samet uymaz
 */

public enum DinamikPanoTuru implements DbEnum {

    POLIKLINIK(1, "Poliklinik"),
    KLINIK(2, "Klinik"),
    AMELIYATHANE(3, "Ameliyathane"),
    DOGUM_SALONU(4, "Doğum Salonu"),
    HEMODIYALIZ(5, "Hemodiyaliz"),
    NOBETCI_ECZANE(6, "Nöbetçi Eczane"),
    NOBETCI_PERSONEL(7, "Nöbetçi Personel"),
    TRIAJ(8, "Triaj"),
    DINAMIK_PANO(98, "Dinamik Pano"),
    DIGER(99, "Diğer");

    private final Integer id;
    private final Serializable adi;

    DinamikPanoTuru(Integer id, Serializable adi) {
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
