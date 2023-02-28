package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleGlasgowMotorDurumu implements DbEnum {
    
    MOTOR_YANIT_YOK(1,"Motor yanıt yok"),
    AGRIYA_EKSTENSOR_CEVAP(2,"Ağrıya Ektensör cevap"),
    ANORMAL_FLEKSOR_CEVAP(3,"Anormal Fleksör cevap"),
    AGRIYA_FLEKSOR_CEVAP(4,"Ağrıya Fleksör cevap"),
    AGRIYI_LOKALIZE_EDER(5,"Ağrıyı Lokalize eder "),
    EMIRLERE_UYAR(6, "Emirlere uyar");
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleGlasgowMotorDurumu(Integer id, Serializable adi) {
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
