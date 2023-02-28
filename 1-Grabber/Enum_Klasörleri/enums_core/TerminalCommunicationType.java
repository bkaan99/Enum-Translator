package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum TerminalCommunicationType implements DbEnum {
    
    WEBSOCKET(1, "Web Socket"),
    RESTFULL(2, "Restfull");
    
    private final Integer id;
    private final Serializable adi;
    
    TerminalCommunicationType(Integer id, Serializable adi) {
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
