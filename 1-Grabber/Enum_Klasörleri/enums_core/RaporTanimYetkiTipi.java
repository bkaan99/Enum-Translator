package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mustafa.kus
 */
public enum RaporTanimYetkiTipi implements DbEnum {
    
    DEFAULT(0,"Yetkisiz"),
    KISI(1, "Kişi"),
    ROL(2, "Rol"),
    ORGANIZASYON(3,"Organizasyon");
    
    
    private final Integer id;
    private final Serializable adi;
    
    RaporTanimYetkiTipi(Integer id, Serializable adi) {
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
