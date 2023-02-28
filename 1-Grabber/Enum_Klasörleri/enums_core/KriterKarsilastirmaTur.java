package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum KriterKarsilastirmaTur implements DbEnum {

    ESITTIR("=", "="),
    BUYUKTUR(">", ">"),
    KUCUKTUR("<", "<"),
    KUCUKESITTIR("<=", "<="),
    BUYUKESITTIR(">=", ">="),
    ICERIR("IN", "IN"),
    LIKE("LIKE", "LIKE");
    private final Serializable id;
    private final Serializable adi;

    KriterKarsilastirmaTur(Serializable id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

    @Override
    public Serializable getId() {
        return id;
    }
}
