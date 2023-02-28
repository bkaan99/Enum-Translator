package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mxxyalcinkaya
 */
public enum WebApplicationType implements DbEnum {
    
    WEB_TERMINAL(1, "Web Terminal"),
    EIMZA_TEST(2, "Eimza Test"),
    WEB_TERMINAL_SETUP(3, "Web Terminal Setup"),
    FONET_KIOSK_STARTER(4, "Fonet Kiosk Çalıştırıcı");
    
    private final Integer id;
    private final Serializable adi;
    
    WebApplicationType(Integer id, Serializable adi) {
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
