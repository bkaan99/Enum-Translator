package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author muysal
 */
public enum KullaniciEkBilgi implements DbEnum {
    
    OTOMATIK_KIOSK_KULLANICISI(1, "Otomatik kiosk kullanıcısı");
    
    private final Integer id;
    private final Serializable adi;
    
    KullaniciEkBilgi(Integer id, Serializable adi) {
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
