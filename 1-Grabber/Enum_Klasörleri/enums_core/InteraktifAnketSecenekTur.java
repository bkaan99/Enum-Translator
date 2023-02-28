package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum InteraktifAnketSecenekTur implements DbEnum {

    SECMELI(1, "Tek Seçimli"),
    COKTAN_SECMELI(2, "Çok Seçimli"),
    METIN(3, "Metin Girişi");

    private final Integer id;
    private final Serializable adi;

    InteraktifAnketSecenekTur(Integer id, Serializable adi) {
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
