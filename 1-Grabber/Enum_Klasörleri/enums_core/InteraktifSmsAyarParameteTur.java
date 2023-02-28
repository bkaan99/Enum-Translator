package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum InteraktifSmsAyarParameteTur implements DbEnum {

    KULLANICI(1, "Kullanici"),
    ORGANIZASYON(2, "Organizasyon"),
    API_KULLANICI_ADI(3, "API Kullanıcı Adı"),
    API_KULLANICI_SIFRE(4, "API Kullanıcı Şifre"),
    API_KURUM_KOD(5, "API Kurum Kod"),
    SMS_MESAJ(6, "SMS Mesaj"),
    SMS_GONDERILECEK_NUMARA(7, "Gonderilecek Numara"),    
    EK_PARAMETRE(9, "Ek Parametre"),
    REQ_HEADER_PARAM(10, "Req Header Parametresi");

    private final Integer id;
    private final Serializable adi;

    InteraktifSmsAyarParameteTur(Integer id, Serializable adi) {
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
