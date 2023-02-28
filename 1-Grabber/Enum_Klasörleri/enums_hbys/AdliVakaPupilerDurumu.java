package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaPupilerDurumu implements DbEnum {

    IZOKORIK(1, "İzokorik"),
    ANIZOKORIK(2, "Anizokorik"),
    DİLATE(3,"Dilate");
    
    private final Integer id;
    private final Serializable adi;
    
    AdliVakaPupilerDurumu(Integer id, Serializable adi) {
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
