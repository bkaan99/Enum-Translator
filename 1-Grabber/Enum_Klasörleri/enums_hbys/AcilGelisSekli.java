package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AcilGelisSekli implements DbEnum {
    
    YUZ_ON_IKI_AMBULANS(1, "Acil Ambulans"),
    ULASIM_AMBULANS(2, "Ulaşım Ambulans"),
    YUZ_ON_IKI_AMBULANS_HELIKOPTER(3, "Ambulans Helikopter"),
    OZEL_AMBULANS(4, "Özel Ambulans"),
    ARAC(5, "Araç"),
    DIGER(9, "Diğer");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilGelisSekli(Integer id, Serializable adi) {
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
