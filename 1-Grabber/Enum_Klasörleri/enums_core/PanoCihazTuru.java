package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author cihad.alan
 */
public enum PanoCihazTuru implements DbEnum {
    
    PANO(1, "PANO"),
    KIOSK(2, "KIOSK"),
    KAN_ALMA(3, "KAN ALMA"),
    YONETICI_PANEL(4,"YÖNETİCİ PANEL"),
    PLAZMA(5,"PLAZMA"),
    HASTA_DURUM(6, "HASTA DURUM");
    
    private final Integer id;
    private final Serializable adi;
    
    PanoCihazTuru(Integer id, Serializable adi) {
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
