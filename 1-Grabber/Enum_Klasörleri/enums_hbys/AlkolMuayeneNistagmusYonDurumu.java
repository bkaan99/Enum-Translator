package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AlkolMuayeneNistagmusYonDurumu implements DbEnum {
    
    SAG(1, "Sağ"),
    SOL(2, "Sol");
    
    private final Integer id;
    private final Serializable adi;
    
    AlkolMuayeneNistagmusYonDurumu(Integer id, Serializable adi) {
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
