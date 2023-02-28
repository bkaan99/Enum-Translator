package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum MasterDbListeAlanVeriTur implements DbEnum {
    
    ORAGNIZASYON(1, "Organizasyon"),
    KULLANICI(2, "Kullanıcı"),
    KULLANICI_ORGANIZASYON(3, "Kullanıcı Organizasyon");
    
    private final Integer id;
    private final Serializable adi;
    
    MasterDbListeAlanVeriTur(Integer id, Serializable adi) {
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
