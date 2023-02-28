package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author cuysal
 */
public enum AmeliyatOncelikSeviyesi implements DbEnum {

    ACIL(1, "Acil"),
    KANSER(2, "Kanser"),
    VIP(3, "Vip");

    private final Integer id;
    private final Serializable adi;

    AmeliyatOncelikSeviyesi(Integer id, Serializable adi) {
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
