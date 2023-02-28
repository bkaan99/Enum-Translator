package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleKVSDurumu implements DbEnum {
    
    CARPINTI(1, "Çarpıntı"),
    GOGUS_AGRISI(2, "Göğüs Ağrısı"),
    NOKTURI(3,"Nokturi"),
    ORTOPNE(4,"Ortopne"),
    ODEM(5,"Ödem"),
    SENKOP(6,"Senkop"),
    PND(7,"PND");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleKVSDurumu(Integer id, Serializable adi) {
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
