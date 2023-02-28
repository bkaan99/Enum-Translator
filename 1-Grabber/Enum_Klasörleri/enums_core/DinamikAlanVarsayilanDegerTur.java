package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikAlanVarsayilanDegerTur implements DbEnum {
    
    KIMLIK_NO(1, "Kimlik No"),
    HASTA_ADI_SOYADI(2, "Hasta Adı Soyadı"),
    DOSYA_NO(3, "Dosya No"),
    ISLEM_NO(4, "İşlem No"),
    SEVK_TARIHI(5, "Sevk Tarihi"),
    DOGUM_TARIHI(6, "Doğum Tarihi"),
    MURACAAT_TARIHI(7, "Müracaat Tarihi"),
    CINSIYET(8, "Cinsiyet"),
    YAS(9, "Yaş"),
    DOKTOR(10, "Doktor"),
    BIRIM(11, "Birim"),
    FONKSIYON(12, "Fonksiyon"),
    UZMANLIK (13, "Uzmanlık"),
    TELEFON_NO (14,"Telefon Numarası"),
    ULKE(15, "Ülke"),
    IL (16, "İl"),
    ILCE (17, "İlçe"),
    HASTA_SINIFI(18, "Hasta Sınıfı"),
    HASTA_KURUMU(19,"Hasta Kurumu"),
    DEVREDILEN_KURUM(20, "Devredilen Kurum"),
    BABA_ADI(21, "Baba Adı"),
    ANNE_ADI(22, "Anne Adı"),
    E_POSTA(23, "Eposta"),
    ORGANIZASYON (24, "Organizasyon"),
    VAKA_TURU (25, "Vaka Türü"),
    HASTA_TURU (26, "Hasta Türü"),
    TANI (27, "Tanı");
    
    
    
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikAlanVarsayilanDegerTur(Integer id, Serializable adi) {
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
