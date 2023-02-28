package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mehmet.guzel
 */
public enum LogIslemTuru implements DbEnum {

    EKLEME(1, "Ekleme"),
    GUNCELLEME(2, "Güncelleme"),
    SILME(3, "Silme"),
    GORUNTULEME(4, "Görüntüleme");

    private final Integer id;
    private final Serializable adi;

    LogIslemTuru(Integer id, Serializable adi) {
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
