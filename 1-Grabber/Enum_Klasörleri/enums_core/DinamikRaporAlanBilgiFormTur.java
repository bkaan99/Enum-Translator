package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikRaporAlanBilgiFormTur implements DbEnum {

    HASTA_KARTI(1, "Hasta Dosya Formu"),
    GELIS_KARTI(2, "Hasta Geliş Formu"),
    POLIKLINIK_SEVK_KARTI(3, "Poliklinik Formu"),
    KLINIK_SEVK_KARTI(4, "Klinik Formu"),
    AGIZ_DIS_POLIKLINIK_SEVK_KARTI(5, "Ağız ve Diş Sağlığı Poliklinik Formu"),
    STOK_KARTI(6, "Stok Kartı"),
    STOK_GIRIS_FISI(7, "Stok Giriş Fişi"),
    STOK_CIKIS_FISI(8, "Stok Çıkış Fişi"),
    KOMISYON_KARAR_TUTANAGI(9, "Komisyon Karar Tutanağı");

    private final Integer id;

    private final Serializable adi;

    DinamikRaporAlanBilgiFormTur(Integer id, Serializable adi) {
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
