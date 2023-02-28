package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author metini
 */
public enum AilePlanlamasiSonUcAydaKullanilanYontem implements DbEnum {

    YOK(1, "Yok"),
    HAP(2, "Hap"),
    KONDOM(3, "Kondom"),
    DERI_ALTI_IMPLANT(4, "Deri Altı İmplant"),
    RIA(5, "Ria"),
    TUP_LIGASYON(6, "Tüp Ligasyon"),
    VAZEKTOMI(7, "Vazektomi"),
    DIGER_MODERN_YONTEMLER(8, "Diğer Modern Yöntemler"),
    GERI_CEKME(9, "Geri Çekme"),
    TAKVIM_YONTEMI(10, "Takvim Yöntemi"),
    DIGER_GELENEKSEL_YONTEMLER(11, "Diğer Geleneksel Yöntemler"),
    BIR_AYLIK_ENJEKSIYON(12, "Bir Aylık Enjeksiyon"),
    UC_AYLIK_ENJEKSIYON(13, "Üç Aylık Enjeksiyon");

    private final Integer id;

    private final Serializable adi;

    AilePlanlamasiSonUcAydaKullanilanYontem(Integer id, Serializable adi) {
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
