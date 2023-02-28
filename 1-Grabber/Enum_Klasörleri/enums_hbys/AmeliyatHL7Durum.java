package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author oozgur
 */
public enum AmeliyatHL7Durum implements DbEnum {
    
    AMELIYAT_RANDEVU_YENI(1, "Ameliyat Randevu Yeni"),
    AMELIYAT_RANDEVU_GUNCELEME(2, "Ameliyat Randevu Güncelleme"),
    AMELIYAT_GERCEKLESME(3, "Ameliyat Gerceklesme"),
    AMELIYAT_GERCEKLESME_GUNCELEME(4, "Ameliyat Gerceklesme Güncelleme"),
    AMELIYAT_GERCEKLESME_BITIS(5, "Ameliyat Gerceklesme Bitiş");
    
    private final Integer id;
    private final Serializable adi;
    
    
    
    AmeliyatHL7Durum(Integer id, Serializable adi) {
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
