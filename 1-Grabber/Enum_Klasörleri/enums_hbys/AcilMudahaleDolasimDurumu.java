package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleDolasimDurumu implements DbEnum {
    
    NORMAL(1, "Normal"),
    SANTRAL_SIYANOZ(2, "Santral Siyanoz"),
    BRADIKARDIK(3, "Bradikardik"),
    KAPILLER_DOL(4, "Kapiller Dol."),
    ZAM(5, "Zam."),
    PRETIBIAL_ODEM(6, "Pretibial Ödem"),
    JENERALIZE_ODEM(7, "Jeneralize Ödem"),
    CILT_KURU(8, "Cilt Kuru"),
    HIPERSALIVE(9, "Hipersalive"),
    SOK(10, "Şok"),
    HIGERTANSIF(11, "Hiğertansif"),
    TASIKARDIK(12, "Taşikardik"),
    PERIFERIK_SIYANOZ(13, "Periferik Siyanoz"),
    HIPOTANSIF(14, "Hipotansif");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleDolasimDurumu(Integer id, Serializable adi) {
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
