package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum InteraktifSmsLogSmsTuru implements DbEnum {

    DIGER(1, "Diğer"),
    POLIKLINIK_GEC_GELIS(2, "Poliklinik Geç Geliş"),
    RADYOLOJI_GEC_GELIS(3, "Radyoloji Geç Geliş"),
    LABORATUVAR_GEC_GELIS(4, "Laboratuvar  Geç Geliş"),
    SITOLOJI_GER_SURE(5, "Sitoloji Gerçekleşme Süresi"),
    PATOLOJI_GER_SURE(6, "Patoloji Gerçekleşme Süresi"),
    YATAN_HASTA_HG(7, "Yatan Hasta Hoşgeldin"),
    MR_BT(8, "Mr & Bt"),
    YENI_DOGAN(9, "Yeni Doğan"),
    STOK_ILAC_KRITIK_SV(10, "Stok İlaç Kritik Seviye"),
    STOK_SARF_KRITIK_SV(11, "Stok Sarf Kritik Seviye"),
    SAGLIK_TARAMA(12, "Sağlık Tarama"),
    ACIL_KONS(13, "Acil Konsültasyon"),
    SERVIS_KONS(14, "Servis Konsültasyon"),
    NUTR_HATIRLATMA(15, "Nutrisyonel Hatırlatma");

    private final Integer id;
    private final Serializable adi;

    InteraktifSmsLogSmsTuru(Integer id, Serializable adi) {
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