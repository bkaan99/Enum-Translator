package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleVentilasyonDurumu implements DbEnum {

    ASIMETRIK_SOL(1, "Asimetrik sol"),
    APNE(2, "Apne"),
    BRADIPNE(3, "Bradipne"),
    BRONSIYAL_SOL(4, "Bronşiyal Sol"),
    DISPNE(5, "Dispne"),
    EXPIRYUM_UZAMIS(6, "Expiryum uzamış"),
    HIH_ESIT(7, "HİH Eşit"),
    HIPERPNE(8, "Hiperpne"),
    INSPIRYUM_UZUN(9, "İnspiryum uzun"),
    NORMAL(10, "Normal"),
    ORTOBNE(11, "Ortobne"),
    PARADOKS(12, "Paradoks"),
    RAL(13, "Ral"),
    RONKUS(14, "Ronküs"),
    SOL_SESLERI_AZALMIS(15, "Sol.sesleri Azalmış"),
    STIDOR(16, "Stidor"),
    TAKIPNE(17, "Takipne"),
    TORASIK_SOL(18, "Torasik sol"),
    YUZEYEL_SOL(19, "Yüzeyel sol"),
    WHEZING(20, "Whezing"),
    DIGER(21, "Diğer");

    private final Integer id;
    private final Serializable adi;

    AcilMudahaleVentilasyonDurumu(Integer id, Serializable adi) {
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
