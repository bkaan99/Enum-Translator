package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleKadinGUSDurumu implements DbEnum {
    
    DISMENORE(1, "Dismenore"),
    INFERTILITE(2, "İnfertilite"),
    VAJINAL_KASINTI(3,"Vajinal kaşıntı"),
    VAJINAL_KANAMA(4,"Vajinal kanama"),
    VAJINAL_AKINTI(5,"Vajinal akıntı");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleKadinGUSDurumu(Integer id, Serializable adi) {
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
