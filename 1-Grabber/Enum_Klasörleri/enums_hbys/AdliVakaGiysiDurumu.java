package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaGiysiDurumu implements DbEnum {
    
    TAMAMEN_CIKARILDI(1,"Tamamen çıkarıldı"),
    KISMEN_CIKARILDI(2,"Kısmen çıkarıldı"),
    CIKARILMADI(3,"Çıkarılmadı");
    
    private final Integer id;
    private final Serializable adi;
    
    AdliVakaGiysiDurumu(Integer id, Serializable adi) {
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
