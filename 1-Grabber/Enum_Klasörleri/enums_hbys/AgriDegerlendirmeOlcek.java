package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum AgriDegerlendirmeOlcek implements DbEnum {

    SAYICA(0, "Sayıca"),
    YUZ(1, "Yüz");

    private final Integer id;
    private final Serializable adi;

    AgriDegerlendirmeOlcek(Integer id, Serializable adi) {
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
