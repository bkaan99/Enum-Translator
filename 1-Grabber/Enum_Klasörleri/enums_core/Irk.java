package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

public enum Irk implements DbEnum {

    SIYAH_OLMAYAN(1, "Siyah olmayan"),
    SIYAH(2, "Siyah");

    private final Integer id;
    private final Serializable adi;

    Irk(Integer id, Serializable adi) {
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
