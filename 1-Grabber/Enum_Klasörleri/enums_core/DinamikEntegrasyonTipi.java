package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author rakti
 */
public enum DinamikEntegrasyonTipi implements DbEnum {

    EKAP(1, "Ekap"),;

    private final Integer id;
    private final Serializable adi;

    DinamikEntegrasyonTipi(Integer id, Serializable adi) {
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
