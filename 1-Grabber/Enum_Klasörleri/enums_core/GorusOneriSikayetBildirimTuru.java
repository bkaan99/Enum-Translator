package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum GorusOneriSikayetBildirimTuru implements DbEnum {

    ILETISIM_TUTUM(1, " İletişim - Tutum"),
    ILETISIM_BILGI(2, "İletişim - Bilgi"),
    DAHILI_IS_BIRLIGI(3, "İletişim - Dahili İşbirliği"),
    PROGRAMLAMA(4, "Programlama"),
    TIBBI_HIZMETLERIN_KALITESI(5, "Tıbbi Hizmetlerin Kalitesi"),
    BAKIM_KALITESI(6, "Bakım Kalitesi"),
    BEKLEME_SURESI(7, "Bekleme Süresi"),
    LAB_HIZMETLERI(8, "Laboratuvar Hizmetleri"),
    SONUC_IZLEM(9, "Sonuç İzlem"),
    HIZMETLERIN_KAYDI(10, "Hizmetlerin Kaydı"),
    IC_SURECLER(11, "İç Süreçler"),
    HASTANE_ALANLARI(12, "Hastane Alanları"),
    PARASAL(13, "Parasal"),
    HIZMETLERIN_ERISEBILIRLIGI(14, " Hizmetlerin Erişilebilirliği");

    private final Integer id;
    private final Serializable adi;

    GorusOneriSikayetBildirimTuru(Integer id, Serializable adi) {
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
