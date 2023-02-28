package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author cihad.alan
 */
public enum Saha implements DbEnum {
    
    DEFAULT(0, "Genel"),
    KAYSERI_SEHIR_HASTANESI(1, "Kayseri Şehir Hastanesi"),
    ESKISEHIR_SEHIR_HASTANESI(2, "Eskişehir Şehir Hastanesi");
    
    private final Integer id;
    private final Serializable adi;
    
    Saha(Integer id, Serializable adi) {
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
