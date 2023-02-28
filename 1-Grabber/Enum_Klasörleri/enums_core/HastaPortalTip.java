package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum HastaPortalTip implements DbEnum {

    LOGIN(1, "Login"),
    ALT_BANNER(2, "Alt Banner"),
    UST_BANNER(3, "Üst Banner");

    private final Integer id;
    private final Serializable adi;

    HastaPortalTip(Integer id, Serializable adi) {
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
