package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

public enum MedeniHal implements DbEnum {

    BEKAR(1, "Bekar"),
    EVLI(2, "Evli"),
    DUL(3, "Boşanmış / Dul"),
    BELIRTILMEDI(99, "Belirtilmedi");

    private final Integer id;
    private final Serializable adi;

    MedeniHal(Integer id, Serializable adi) {
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
