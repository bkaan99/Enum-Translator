package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum InteraktifDuyuruSeviye implements DbEnum {

    DUSUK(1, "Düşük"),
    NORMAL(2, "Normal"),
    YUKSEK(3, "Yüksek"),
    COK_YUKSEK(4, "Çok Yüksek");

    private final Integer id;
    private final Serializable adi;

    InteraktifDuyuruSeviye(Integer id, Serializable adi) {
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
