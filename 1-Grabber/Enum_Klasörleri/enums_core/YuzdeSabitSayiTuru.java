package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author sgozmen
 */
public enum YuzdeSabitSayiTuru implements DbEnum {
    
    SABIT(1, "Sabit"),
    YUZDE(2, "%");
    
    private final Integer id;
    private final Serializable adi;
    
    YuzdeSabitSayiTuru(Integer id, Serializable adi) {
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
