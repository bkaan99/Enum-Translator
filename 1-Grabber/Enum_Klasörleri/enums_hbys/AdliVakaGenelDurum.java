package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaGenelDurum implements DbEnum {

    IYI(1, "İyi"),
    ORTA(2, "Orta"),
    KOTU(3, "Kötü");
    
    private final Integer id;
    private final Serializable adi;
    
    AdliVakaGenelDurum(Integer id, Serializable adi) {
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
