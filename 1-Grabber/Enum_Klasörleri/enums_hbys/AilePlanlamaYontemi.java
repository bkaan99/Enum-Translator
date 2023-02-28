package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.Durum;
import tr.com.fonet.hbys.common.skrsenums.base.SkrsKayitEnum;

import java.io.Serializable;

/**
 *
 * @author osmanumut
 */
public enum AilePlanlamaYontemi implements SkrsKayitEnum {
    
    YOK(97, "Yok", Durum.AKTIF),
    HAP(2, "Hap", Durum.AKTIF),
    KONDOM(3, "Kondom", Durum.AKTIF),
    DERI_ALTI_IMPLANT(5, "Deri Alti İmplant", Durum.AKTIF),
    RIA(6, "RIA", Durum.AKTIF),
    TUP_LIGASYONU(7, "Tüp Ligasyonu", Durum.AKTIF),
    VAZEKTOMI(8, "Vazektomi", Durum.AKTIF),
    DIGER_MODERN_YONTEMLER(9, "Diğer Modern Yöntemler", Durum.AKTIF),
    GERI_CEKME(10, "Geri Çekme", Durum.AKTIF),
    TAKVIM_YONTEMI(11, "Takvim Yöntemi", Durum.AKTIF),
    DIGER_GELENEKSEL_YONTEMLER(12, "Diğer Geleneksel Yöntemler", Durum.AKTIF),
    _1_AYLIK_ENKJEKSIYON(13, "1 Aylık Enjeksiyon", Durum.AKTIF),
    _3_AYLIK_ENKJEKSIYON(14, "3 Aylık Enjeksiyon", Durum.AKTIF),
    ENJEKSIYON(4, "Enjeksiyon", Durum.PASIF);
    
    private final Integer id;
    private final Serializable adi;
     private final Durum durum;
    
    AilePlanlamaYontemi(Integer id, Serializable adi, Durum durum) {
        this.id = id;
        this.adi = adi;
        this.durum = durum;
    }
    
    @Override
    public Serializable getAdi() {
        return adi;
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    
   @Override
    public Durum getDurum() {
        return durum;
    }

    @Override
    public String getSistemKodu() {
        return "636bdc8a-eea8-41cf-bcb8-b244cfa8e250";
    }
}
