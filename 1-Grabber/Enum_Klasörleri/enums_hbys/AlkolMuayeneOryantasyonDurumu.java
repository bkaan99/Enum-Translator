package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AlkolMuayeneOryantasyonDurumu implements DbEnum {
    
    ORYENTE(1, "Oryente"),
    ORYENTE_DEGIL(2, "Oryente Değil");
    
    private final Integer id;
    private final Serializable adi;
    
    AlkolMuayeneOryantasyonDurumu(Integer id, Serializable adi) {
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
