package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum AgriDegerlendirme implements DbEnum {

    AGRI_VAR(0, "Ağrı Var"),
    AGRI_YOK(1, "Ağrı Yok");

    private final Integer id;
    private final Serializable adi;

    AgriDegerlendirme(Integer id, Serializable adi) {
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
