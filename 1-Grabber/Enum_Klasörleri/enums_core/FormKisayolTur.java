package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum FormKisayolTur implements DbEnum {
    
    DESKTOP(1, "Masaüstü"),
    TASKBAR(2, "Araç Çubuğu"),
    DESKTOP_TASKBAR(3, "Masaüsütü Araç Çubuğu");
    
    private final Integer id;
    private final Serializable adi;
    
    FormKisayolTur(Integer id, Serializable adi) {
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
