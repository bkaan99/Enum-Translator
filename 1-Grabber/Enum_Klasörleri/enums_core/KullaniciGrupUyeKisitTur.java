package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum KullaniciGrupUyeKisitTur implements DbEnum {
    
    YETKI_ZAMANI(1, "Yetki Zamanı"),
    GIRIS_ENGELI(2, "Giriş Engeli");
    
    private final Integer id;
    private final Serializable adi;
    
    KullaniciGrupUyeKisitTur(Integer id, Serializable adi) {
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
