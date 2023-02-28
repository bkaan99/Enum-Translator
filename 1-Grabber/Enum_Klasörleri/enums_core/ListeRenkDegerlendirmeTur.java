package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum ListeRenkDegerlendirmeTur implements DbEnum {

    ESITTIR("=", "Eşit"),
    BUYUKTUR(">", "Büyük"),
    KUCUKTUR("<", "Küçük"),
    KUCUKESITTIR("<=", "Küçük ya da Eşit"),
    BUYUKESITTIR(">=", "Büyük ya da Eşit"),
    ARASINDA("<>", "İki Değer Arasında");

    private final Serializable id;
    private final Serializable adi;

    ListeRenkDegerlendirmeTur(Serializable id, Serializable adi) {
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
