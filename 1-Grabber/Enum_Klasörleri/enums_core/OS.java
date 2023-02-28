package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum OS implements DbEnum {
    
    OTHER(0, "Not supported"),
    WINDOWS(1, "Windows"),
    UNIX(2, "Unix"),
    SOLARIS(3, "Solaris"),
    MAC(4, "Mac");
    
    
    private final Integer id;
    private final Serializable adi;
    
    OS(Integer id, Serializable adi) {
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
