package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osmanumut
 */
public enum DinamikEkranIliskiTur implements DbEnum {
    
    HASTA(1, "Hasta"),
    HASTA_GELIS(2, "Hasta Geliş"),
    HASTA_BIRIM_SEVK(3, "Hasta Birim Sevk"),
    POLIKLINIK(4, "Poliklinik"),
    KLINIK(5, "Klinik");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikEkranIliskiTur(Integer id, Serializable adi) {
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
