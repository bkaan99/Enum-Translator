package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum LoginDevice implements DbEnum {

    UNKNOWN_DEVICE(0, "Bilinmeyen Cihaz"),
    PC(1, "Windows PC"),
    MAC(2, "Macintosh"),
    IPHONE(3, "iPhone"),
    IPAD(4, "iPad"),
    ANDROID_PHONE(5, "Android Phone"),
    ANDROID_TABLET(6, "Android Tablet"),
    ANDROID_DEVICE(7, "Android Cihaz");

    private final Integer id;
    private final Serializable adi;

    LoginDevice(Integer id, Serializable adi) {
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
