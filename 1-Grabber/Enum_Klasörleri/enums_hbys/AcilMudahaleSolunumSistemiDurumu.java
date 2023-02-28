package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleSolunumSistemiDurumu implements DbEnum {
    
    BALGAM(1, "Balgam"),
    HEMOPTIZI(2,"Hemoptizi"),
    NEFES_DARLIGI(3,"Nefes darlığı"),
    OKSURUK(4,"Öksürük"),
    SIYANOZ(5,"Siyanoz"),
    WHEEZING(6, "Wheezing");
    
    
   
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleSolunumSistemiDurumu(Integer id, Serializable adi) {
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
