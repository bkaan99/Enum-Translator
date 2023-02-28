package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author eture
 */
public enum AlindiAlinmadi implements DbEnum {

    ALINMADI(0, "Alınacak"),
    ALINDI(1, "Alınmayacak");

    private final Integer id;
    private final Serializable adi;

    AlindiAlinmadi(Integer id, Serializable adi) {
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
