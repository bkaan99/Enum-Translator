package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

public enum EvetHayir2 implements DbEnum {

    HAYIR(0, "Hayır"),
    EVET(1, "Evet");
    //-----------------------------------
    private final Serializable id;
    private final Serializable adi;
    //-----------------------------------

    EvetHayir2(Serializable id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }

    @Override
    public Serializable getId() {
        return id;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }
}
