package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum AglamaCocuk implements DbEnum {

    SESSIZ(0, "Sakin,ağlamıyor",0D),
    INLEME_AGLAMA(1, "İnleme-Ağlama var",1D);

    private final Integer id;
    private final Serializable adi;
    private final Double degeri;

    AglamaCocuk(Integer id, Serializable adi,Double degeri) {
        this.id = id;
        this.adi = adi;
        this.degeri = degeri;
    }
    
    @Override
    public Serializable getAdi() {
        return adi;
    }
    
    @Override
    public Integer getId() {
        return id;
    }

    public Double getDegeri() {
        return degeri;
    }
}
