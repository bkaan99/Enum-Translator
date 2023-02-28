package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum BaslangicBitis implements DbEnum {
    
    BASLANGIC(1, "Başlangıç"),
    BITIS(2, "Bitiş");
    
    private final Integer id;
    private final Serializable adi;
    
    BaslangicBitis(Integer id, Serializable adi) {
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
