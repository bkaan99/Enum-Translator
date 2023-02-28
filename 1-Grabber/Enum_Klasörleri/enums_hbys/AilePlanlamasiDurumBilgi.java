package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AilePlanlamasiDurumBilgi implements DbEnum {

    GEBELIK_SONLANDIRMA_SAYI(1, "Gebelik Sonlandırma Sayı"),
    DUSTUKTEN_SONRA_AP_YON_BAS_KISI(2, "Düşükten Sonra AP Yöntemi Başlanan Kişi Sayısı"),
    DOGUM_SONU_AP_YON_BAS_KISI(3, "Doğum Sonu 42. Güne Kadar AP Yöntemi Başlanan Kişi Sayısı");

    private final Integer id;
    private final Serializable adi;

    AilePlanlamasiDurumBilgi(Integer id, Serializable adi) {
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
