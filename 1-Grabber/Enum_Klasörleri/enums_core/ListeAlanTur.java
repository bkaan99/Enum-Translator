package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum ListeAlanTur implements DbEnum {

    METIN(1, "Metin"),
    ACILIR_KUTU(2, "Açılır Kutu"),
    TARIH(3, "Tarih"),
    TARIH_SAAT(4, "Tarih Saat"),
    SAAT(5, "Saat");

    private final Integer id;
    private final Serializable adi;

    ListeAlanTur(Integer id, Serializable adi) {
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
