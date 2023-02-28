package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum LoginOS implements DbEnum {

    OTHER(0, "Not supported"),
    WINDOWS(1, "Windows"),
    UNIX(2, "Unix"),
    SOLARIS(3, "Solaris"),
    MAC(4, "Mac"),
    IOS(5, "iOS"),
    ANDROID(6, "Android");

    private final Integer id;
    private final Serializable adi;

    LoginOS(Integer id, Serializable adi) {
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
