package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AlkolMuayeneNistagmusDeger implements DbEnum {
  
    HORIZONTAL(1, "Horizontal"),
    VERTIKAL(2, "Vertikal"),
    ROTATUAR(3, "Rotatuar"),
    YOK(4, "Yok"),
    DEGERLENDIRILEMEDI(5, "Değerlendirilemedi");
    
    private final Integer id;
    private final Serializable adi;
    
    AlkolMuayeneNistagmusDeger(Integer id, Serializable adi) {
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
