package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author oozgur
 */
public enum AgentSorguParametreDegerTur implements DbEnum {
    
    TARIH(1, "Tarih"),
    ORGANIZASYON(2, "Organizasyon"),
    SQL(3, "SQL"),
    DIGER(9, "Diğer");
    
    private final Integer id;
    private final Serializable adi;
    
    AgentSorguParametreDegerTur(Integer id, Serializable adi) {
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
