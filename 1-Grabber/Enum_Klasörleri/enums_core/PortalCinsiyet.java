package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;
import tr.com.fonet.core.common.utils.NumberUtils;

import java.io.Serializable;

public enum PortalCinsiyet implements DbEnum {

    ERKEK(1, "Erkek"),
    KADIN(2, "Kadın"),
    BELIRTILMEMIS(3, "Belirtmek İstemiyorum");

    private final Integer id;
    private final Serializable adi;

    PortalCinsiyet(Integer id, Serializable adi) {
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
