package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleGUSDurumu implements DbEnum {

    DIZURI(1,"Dizüri"),
    HEMATURI(2, "Hematüri"),
    POLIURI(3, "Poliüri"),
    YAN_AGRISI(4,"Yan Ağrısı");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleGUSDurumu(Integer id, Serializable adi) {
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
