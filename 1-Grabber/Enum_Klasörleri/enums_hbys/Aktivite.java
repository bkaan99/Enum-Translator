package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum Aktivite implements DbEnum {
    
    RAHAT_GEVSEK(0, "Rahat,gevşek"),
    KISMEN_GERGIN(1, "Kısmen gergin"),
    KOMPLE_GERGIN(2, "Komple gergin"),
    TAMAMEN_RAHAT(3, "Tamamen rahat");

    private final Integer id;
    private final Serializable adi;
    
    Aktivite(Integer id, Serializable adi) {
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
