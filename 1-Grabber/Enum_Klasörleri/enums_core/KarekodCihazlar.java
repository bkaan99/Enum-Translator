package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author rakti
 */
public enum KarekodCihazlar implements DbEnum {

    SPIDER_SP400(1, "Spider SP-400"),
    DIGER(99, "Diğer");

    private final Integer id;
    private final Serializable adi;

    KarekodCihazlar(Integer id, Serializable adi) {
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
