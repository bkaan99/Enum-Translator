package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaGelisNedeni implements DbEnum {
     
    ETKILI_EYLEM(1,"Etkili Eylem"),
    TRAFIK_KAZASI(2,"Trafik Kazası"),
    IS_KAZASI(3,"İş Kazası"),
    DIGER_KAZALAR(4,"Diğer Kazalar"),
    GOZALTI_ISLEMI_GIRIS(5,"Gözaltı İşlemi - Giriş"),
    GOZALTI_ISLEMI_CIKIS(6,"Gözaltı İşlemi - Çıkış"),
    GOZALTI_ISLEMI_UZATMA(7,"Gözaltı İşlemi - Uzatma"),
    GOZALTI_ISLEMI_YER_DEGISTIRME(8,"Gözaltı İşlemi - Yer Değiştirme"),
    INSAN_HAKLARI_IHLALI_IDDIASI(9,"İnsan Hakları İhlali İddiası"),
    INTIHAR_GIRISIMI(10,"İntihar Girişimi"),
    ZEHIRLENMELER(11,"Zehirlenmeler"),
    DIGER(12,"Diğer(Belirtiniz)");
    
    private final Integer id;
    private final Serializable adi;
    
    AdliVakaGelisNedeni(Integer id, Serializable adi) {
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
