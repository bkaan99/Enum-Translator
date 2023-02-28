package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum OturumSureKontrol implements DbEnum {
    
    _0(0, "0"),
    _15(15, "15 Dakika"),
    _30(30, "30 Dakika");
    
    private final Integer id;
    private final Serializable adi;
    
    OturumSureKontrol(Integer id, Serializable adi) {
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
