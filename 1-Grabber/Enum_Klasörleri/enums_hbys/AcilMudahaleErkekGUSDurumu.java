package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleErkekGUSDurumu implements DbEnum {
    
    PENIL_YARA(1,"Penil yara"),
    PENIL_AKINTI(2,"Penil akıntı"),
    TESTIS_AGRISI(3, "Testis ağrısı"),
    TESTIS_SISLIGI(4, "Testis şişliği");
   
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleErkekGUSDurumu(Integer id, Serializable adi) {
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
