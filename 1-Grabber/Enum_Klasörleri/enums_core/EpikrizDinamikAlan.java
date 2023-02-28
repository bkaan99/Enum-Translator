package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author aarslan
 */
public enum EpikrizDinamikAlan implements DbEnum {

    SIKAYET(0, "Şikayet"),
    HIKAYE(1, "Hikaye"),
    OZGECMIS(2, "Öz Geçmiş"),
    FIZIKMUAYENE(3, "Fizik Muayene"),
    KLINIKIZLEM(4, "Klinik İzlem"),
    TEDAVIUYGULAMA(5, "Tedavi Uygulama"),
    KARARTEDAVI(6, "Karar Tedavi"),
    TANI(7, "Tani"),
    KONSULTASYON(8, "Konsültasyon"),
    DOGUMB_BILGILERI(9, "Dğum Bilgileri"),
    LABORATUVAR_LISTESI(10, "Laboratuvar Listesi"),
    PATOLOJI_LISTESI(11, "Patoloji Listesi"),
    KANURUN_LISTESI(12, "Kan ürün Listesi"),
    ILAC_LISTESI(13, "İlaç Listesi"),
    SARF_LISTESI(14, "Sarf Listesi"),
    YOGUNBAKIM_ACIKLAMA(15, "Yoğun Bakım Açıklama "),
    REFAKAT_ACIKLAMA(16, "Refakat Açıklama"),
    RADYOLOJI_LISTESI(17, "Radyoloji Listesi"),
    ANESTEZI_NOTU(18, "Anestezi Notu"),
    ANESTEZI_LISTESI(19, "Anestezi Listesi"),
    AMELIYAT_NOTU(20, "Amliyat Notu"),
    AMELIYAT_LISTESI(21, "Ameliyat Listesi"),
    RECETE_LISTESI(22, "Reçete Listesi"),
    DIS_TEDAVI_BILGILERI(23, "Diş Tedavi Bilgileri"),
    TRIAJ_ACIKLAMA(24, "Triaj Açıklama"),
    SOSYAL_HIZMET_ACIKLAMA(25, "Sosyal Hizmet Açıklama"),
    TUM_ALANLAR(26, "Tüm Alanlar");

    private final Integer id;
    private final Serializable adi;

    EpikrizDinamikAlan(Integer id, Serializable adi) {
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
