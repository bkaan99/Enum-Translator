package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum YetkiDurum implements DbEnum {
    
    VERILMIS_YETKI(1, "Verilmiş Yetkiler"),
    VERILMEMIS_YETKI(2, "Verilmemiş Yetkiler");
    
    private final Integer id;
    private final Serializable adi;
    
    YetkiDurum(Integer id, Serializable adi) {
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
