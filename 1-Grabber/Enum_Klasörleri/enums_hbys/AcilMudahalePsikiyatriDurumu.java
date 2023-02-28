package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahalePsikiyatriDurumu implements DbEnum {
    
    DAVRANIS_BOZUKLUGU(1, "Davranış Bozukluğu"),
    HALUSINASYONLAR(2, "Halüsinasyonlar"),
    INTIHAR_DUSUNCESI(3, "İntihar düşüncesi"),
    PARANOID_DUSUNCE(4, "Paranoid düşünce");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahalePsikiyatriDurumu(Integer id, Serializable adi) {
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
