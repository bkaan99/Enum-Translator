package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mustafa.kus
 */
public enum DinamikRaporToplamTipi implements DbEnum {
    
 
    COUNT("COUNT", "Adet"),
    SUM("SUM", "Toplam"),
    AVERAGE("AVERAGE", "Ortalama"),
    LOWEST("LOWEST", "Minimum"),	
    HIGHEST("HIGHEST", "Maksimum"),
    STANDARD_DEVIATION("STANDARD_DEVIATION", "Standart Sapma"),
    VARIANCE("VARIANCE", "Varyans"),
    FIRST("FIRST", "İlk"),	
    DISTINCT_COUNT("DISTINCT_COUNT", "Farklı Adet");

    
    private final Serializable id;
    private final Serializable adi;
    
    DinamikRaporToplamTipi(Serializable id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }
    
    @Override
    public Serializable getAdi() {
        return adi;
    }
    
    @Override
    public Serializable getId() {
        return id;
    }
}
