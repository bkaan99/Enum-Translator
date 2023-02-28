package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AlkolMuayeneKooperasyonDurumu implements DbEnum {
    
    KOOPERE(1, "Koopere"),
    KOOPERE_DEGIL(2, "Koopere Değil");
    
    private final Integer id;
    private final Serializable adi;
    
    AlkolMuayeneKooperasyonDurumu(Integer id, Serializable adi) {
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
