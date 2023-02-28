package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osmanumut
 */
public enum DinamikSorguGrafikHesapTur implements DbEnum {
    
    ORTALAMA(1, "Ortalama"),
    TOPLAM(2, "Toplam"),
    MIKTAR(3, "Miktar"),
    MIN(4, "Min"),
    MAX(5, "Max");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikSorguGrafikHesapTur(Integer id, Serializable adi) {
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
