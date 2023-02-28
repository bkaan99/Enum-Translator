package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaRaporTuru implements DbEnum {
    
    KESIN_RAPOR(1, "Kesin Rapor"),
    GECICI_RAPOR(2, "Geçici Rapor");
    
    private final Integer id;
    private final Serializable adi;
    
    AdliVakaRaporTuru(Integer id, Serializable adi) {
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
