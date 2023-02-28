package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum ModulPortalTur implements DbEnum {

    PORTAL(1, "Portal"),
    HAZIR_EKRAN(2, "Hazir Ekran");

    private final Integer id;
    private final Serializable adi;

    ModulPortalTur(Integer id, Serializable adi) {
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
