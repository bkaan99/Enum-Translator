package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum InteraktifAnketTur implements DbEnum {

    GENEL(1, "Genel"),
    OZEL(2, "Özel"),
    HASTA_MEMNUNIYETI(3, "Hasta Memnuniyeti"),
    CALISAN_MEMNUNIYETI(4, "Çalışan Memnuniyeti"),
    DIGER(5, "Diğer"),
    MANUEL(6,"Manuel Anket");

    private final Integer id;

    private final Serializable adi;

    InteraktifAnketTur(Integer id, Serializable adi) {
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
