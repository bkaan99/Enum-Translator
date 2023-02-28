package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author muysal
 */
public enum AjandaAdresDefteriGrubu implements DbEnum {
    
    IS(1, "İş"),
    OZEL(2, "Özel"),
    DIGER(3, "Diğer");
    
    private final Integer id;
    private final Serializable adi;
    
    AjandaAdresDefteriGrubu(Integer id, Serializable adi) {
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
