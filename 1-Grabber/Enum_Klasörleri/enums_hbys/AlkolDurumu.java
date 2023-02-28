package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum AlkolDurumu implements DbEnum {
    
    ALKOLLU(1, "Alkollüdür"),
    ALKOLSUZ(2, "Alkolsüzdür");
    
    private final Integer id;
    private final Serializable adi;
    
    AlkolDurumu(Integer id, Serializable adi) {
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
