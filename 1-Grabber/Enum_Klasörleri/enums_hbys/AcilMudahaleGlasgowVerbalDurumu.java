package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleGlasgowVerbalDurumu implements DbEnum {
    
    VERBAL_YANIT_YOK(1, "Verbal Yanıt Yok"),
    ANLASILMAZ_SESLER(2, "Anlaşılmaz sesler"),
    ANLAMSIZ_KELIMELER(3,"Anlamsız kelimeler"),
    DEZORYANTE(4,"Dezoryante"),
    ORYANTE(5,"Oryante");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleGlasgowVerbalDurumu(Integer id, Serializable adi) {
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
