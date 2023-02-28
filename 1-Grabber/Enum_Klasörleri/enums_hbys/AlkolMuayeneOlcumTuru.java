package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AlkolMuayeneOlcumTuru implements DbEnum {
  
    KAN(1, "Kan"),
    ALVEOL_HAVASI(2, "Alveol Havası");
    
    private final Integer id;
    private final Serializable adi;
    
    AlkolMuayeneOlcumTuru(Integer id, Serializable adi) {
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
