package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaSolunumDurumu implements DbEnum {

    YOK(0, "Yok"),
    RAHAT_DUZENLI(1, "Rahat,düzenli"),
    HIZLI(2, "Hızlı"),
    YAVAS(3, "Yavaş"),
    YUZEYSEL(4, "Yüzeysel"),
    SIKINTILI(5, "Sıkıntılı");

    private final Integer id;
    private final Serializable adi;
    
    AdliVakaSolunumDurumu(Integer id, Serializable adi) {
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
