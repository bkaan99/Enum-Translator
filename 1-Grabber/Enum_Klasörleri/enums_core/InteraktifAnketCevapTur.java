package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum InteraktifAnketCevapTur implements DbEnum {

    SECMELI(1, "Seçmeli"),
    COKTAN_SECMELI(2, "Çoktan Seçmeli"),
    METIN(3, "Metin Girişi");

    private final Integer id;
    private final Serializable adi;

    InteraktifAnketCevapTur(Integer id, Serializable adi) {
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
