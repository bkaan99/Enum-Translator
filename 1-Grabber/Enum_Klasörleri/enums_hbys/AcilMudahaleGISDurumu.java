package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleGISDurumu implements DbEnum {
    
    BULANTI(1,"Bulantı"),
    DIARE(2,"Diare"),
    DISTANSIYON(3,"Distansiyon"),
    HEMATOKEZYA(4,"Hematokezya"),
    KARIN_AGRISI(5,"Karın ağrısı"),
    KASIKTA_SISME(6, "Kasıkta şişme"),
    KASIKTA_KITLE(7, "Kasıkta kitle"),
    KASINTI(8,"Kaşıntı"),
    KONSTIPASYON(9,"Konstipasyon"),
    KUSMA(10,"Kusma"),
    MELENA(11,"Melena"),
    SARILIK(12,"Sarılık");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleGISDurumu(Integer id, Serializable adi) {
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
