package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mxxyalcinkaya
 */
public enum IpVersion implements DbEnum {
    
    IPv4(1, "Ip v4"),
    IPv6(2, "Ip v6"),
    UNDEFINED(3, "undefined");
    
    private final Integer id;
    private final Serializable adi;
    
    IpVersion(Integer id, Serializable adi) {
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
