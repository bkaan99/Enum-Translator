package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myilmaz
 */
public enum YardimDegistirilmeDurumu implements DbEnum {
    
   DEGISTIRILEBILIR(1, "Değiştirilebilir"),
    DEGISTIRILEMEZ(2, "Değiştirilemez");
    
    private final Integer id;
    private final Serializable adi;
    
    YardimDegistirilmeDurumu(Integer id, Serializable adi) {
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
