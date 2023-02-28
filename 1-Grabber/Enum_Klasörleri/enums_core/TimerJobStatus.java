package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum TimerJobStatus implements DbEnum {

    CALISIYOR(1, "Çalışıyor"),
    CALISMIYOR(2, "Çalışmıyor"),
    HATALI(3, "Çalışmıyor"),
    TAMAMLANDI(4, "Tamamlandı");

    private final Integer id;
    private final Serializable adi;

    TimerJobStatus(Integer id, Serializable adi) {
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
