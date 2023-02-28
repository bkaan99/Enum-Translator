package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sarslan
 */
public enum AlindigiYon implements DbEnum {
    SAG(1, "Sağ"),
    SOL(2, "Sol"),
    ORTA(3, "Orta"),
    SAG_ALT(4, "Sağ Alt"),
    SOL_ALT(5, "Sol Alt"),
    SAG_UST(6, "Sağ Üst"),
    SOL_UST(7, "Sol Üst"),
    SAG_SOL(8, "Sağ Sol");

    private final Integer id;
    private final Serializable adi;

    AlindigiYon(Integer id, Serializable adi) {
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
