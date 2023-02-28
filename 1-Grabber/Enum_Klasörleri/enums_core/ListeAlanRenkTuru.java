package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum ListeAlanRenkTuru implements DbEnum {

    YAZI_RENGI(1, "Yazı Rengi"),
    ARKA_PLAN_RENGI(2, "Arka Plan Rengi");

    private final Integer id;
    private final Serializable adi;

    ListeAlanRenkTuru(Integer id, Serializable adi) {
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
