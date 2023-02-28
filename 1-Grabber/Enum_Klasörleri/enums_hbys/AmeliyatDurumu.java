package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AmeliyatDurumu implements DbEnum {
   
    ILK_KABUL(1, "İlk Kabul"),
    KABUL_EDILDI(2, "Kabul Edildi"),
    UYGULANDI(3, "Uygulandı");
    
    private final Integer id;
    private final Serializable adi;
    
    AmeliyatDurumu(Integer id, Serializable adi) {
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
