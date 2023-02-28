package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;
import tr.com.fonet.core.common.utils.NumberUtils;

public enum Cinsiyet implements DbEnum {

    ERKEK(1, "Erkek"),
    KADIN(2, "Kadın");

    private final Integer id;
    private final Serializable adi;

    Cinsiyet(Integer id, Serializable adi) {
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

    public Integer getIntId() {
        return NumberUtils.createInteger(id);
    }
}
