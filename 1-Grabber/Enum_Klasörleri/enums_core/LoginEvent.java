package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum LoginEvent implements DbEnum {

    /**
     *Sistem ilk defa çalıştığında sistem admin tarafından çalışmak zorundadır.
     *Sisteme ilk girişte bu olay tetiklenir. 
     */
    FIRST_APPLICATION_RUN(1, "İlk defa sistem çalıştı"),
    /**
     *Local bilgisayar üzerinden giriş yapıldığında bu olay çalışır.
     */
    AUTO_LOGIN(2, "Otomatik login fonksiyonu çalıştı"),
    /**
     *Sisteme ilk defa sistem admin girdiğinde çalışır
     */
    FIRST_SISTEM_ADMIN_LOGIN(3, "Sistem admin ilk defa giriş yaptı"),
    /**
     *Sisteme sistem admin girdiğinde çalışır
     */
    SISTEM_ADMIN_LOGIN(4, "Sisteme sistem admin tarafıdan giriş yapıldı"),
    /**
     *Sisteme kurum admin girdiğinde çalışır
     */
    KURUM_ADMIN_LOGIN(5, "Sisteme kurum admin tarafıdan giriş yapıldı"),
    /**
     * Sisteme normal bir giriş yapıldığında tetiklenir
     */
    LOGIN(6, "Sisteme giriş yapıldı");

    private final Integer id;
    private final Serializable adi;

    LoginEvent(Integer id, Serializable adi) {
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
