package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaBulunanKisi1 implements DbEnum {
    
    TABIB_ILE_MUAYENE_EDILEN_YALNIZ(1,"Tabib ile muayene edilen, yalnız"),
    TABIB_ILE_MUAYENE_EDILEN(2,"Tabib ile muayene edilen"),
    TABIB_ILE_MUAYENE_EDILEN_SAGLIK_PERSONELI(3,"Tabib ile muayene edilen, sağlık personeli"),
    SAGLIK_MESLEGI_MENSUBU_PERSONEL(4,"Sağlık Mesleği mensubu personel"),
    GUVENLIK_GOREVLISI(5,"Güvenlik Görevlisi"),
    MUAYENE_EDILENIN_MUDAFII(6,"Muayene Edilenin Müdafii");
    
    
    private final Integer id;
    private final Serializable adi;
    
    AdliVakaBulunanKisi1(Integer id, Serializable adi) {
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
