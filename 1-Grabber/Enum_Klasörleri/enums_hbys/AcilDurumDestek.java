package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum AcilDurumDestek implements DbEnum {

    ULASIM(1, "Ulaşım"),
    OKSIJEN(2, "Oksijen"),
    ESLER(3, "Eşler"),
    DIGER(4, "Diğer");

    private final Integer id;
    private final Serializable adi;

    AcilDurumDestek(Integer id, Serializable adi) {
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
