package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AlkolMuayeneDiplopiDurumu implements DbEnum {
    
    VAR(1, "Var"),
    YOK(2, "Yok"),
    DEGERLENDIRILMEDI(3, "Değerlendirilmedi");
    
    private final Integer id;
    private final Serializable adi;
    
    AlkolMuayeneDiplopiDurumu(Integer id, Serializable adi) {
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
