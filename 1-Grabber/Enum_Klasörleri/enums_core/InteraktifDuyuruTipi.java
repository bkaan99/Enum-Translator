package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mehmet.guzel
 */
public enum InteraktifDuyuruTipi implements DbEnum {

    NORMAL(1, "Normal"),
    LOGIN(2, "Login Anında Ekrana"),
    ANLIK(3, "Yayınlandığı Anda Ekrana");

    private final Integer id;
    private final Serializable adi;

    InteraktifDuyuruTipi(Integer id, Serializable adi) {
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
