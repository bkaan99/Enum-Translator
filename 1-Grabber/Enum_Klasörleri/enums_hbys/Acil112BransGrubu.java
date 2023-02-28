package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum Acil112BransGrubu implements DbEnum {

    ACIL_ERISKIN(1, "Acil Erişkin"),
    ACIL_COCUK(2, "Acil Çocuk"),
    YOGUN_BAKIM_KORONER(3, "Yoğun Bakım Koroner"),
    YOGUN_BAKIM_KALP_DAMAR(4, "Yoğun Bakım Kalp Damar"),
    YOGUN_BAKIM_ANESTEZI_REANIMASYON(5, "Yoğun Bakım Anestezi/Reanimasyon"),
    YOGUN_BAKIM_NOROLOJI(6, "Yoğun Bakım Nöroloji"),
    YOGUN_BAKIM_BEYIN_CERRAHISI(7, "Yoğun Bakım Beyin Cerrahisi"),
    YOGUN_BAKIM_GENEL_CERRAHI(8, "Yoğun Bakım Genel Cerrahi"),
    YOGUN_BAKIM_DAHILIYE(9, "Yoğun Bakım Dahiliye"),
    YOGUN_BAKIM_GOGUS_HASTALIKLARI(10, "Yoğun Bakım Göğüs Hastalıkları"),
    YOGUN_BAKIM_KADIN_DOGUM(11, "Yoğun Bakım Kadın Doğum"),
    YOGUN_BAKIM_PEDIATRI(12, "Yoğun Bakım Pediatri"),
    YOGUN_BAKIM_YENIDOGAN(13, "Yoğun Bakım Yenidoğan"),
    YOGUN_BAKIM_YANIK(14, "Yoğun Bakım Yanık"),
    YOGUN_BAKIM_DIGER(34, "Yoğun Bakım Diğer"),
    SERVIS_PEDIATRI(15, "Servis Pediatri"),
    SERVIS_DAHILIYE(16, "Servis Dahiliye"),
    SERVIS_KALP_DAMAR(17, "Servis Kalp Damar"),
    SERVIS_KADIN_DOGUM(18, "Servis Kadın Doğum"),
    SERVIS_GENEL_CERRAHI(19, "Servis Genel Cerrahi"),
    SERVIS_ORTOPEDI(20, "Servis Ortopedi"),
    SERVIS_KALP_DAMAR_CERRAHISI(21, "Servis Kalp Damar Cerrahisi"),
    SERVIS_BEYIN_CERRAHISI(22, "Servis Beyin Cerrahisi"),
    SERVIS_YENIDOGAN(23, "Servis Yenidoğan"),
    SERVIS_DIALIZ(24, "Servis Dializ"),
    SERVIS_DIGER(25, "Servis Diğer"),
    AMELIYATHANE(26, "Ameliyathane"),
    MORG(27, "Morg"),
    SERVIS_ENFEKSIYON(28, "Servis Enfeksiyon"),
    SERVIS_KARDIYOLOJI(29, "Servis Kardiyoloji"),
    SERVIS_COCUK_CERRAHISI(30, "Servis Çocuk Cerrahisi"),
    SERVIS_COCUK_KARDIYOLOJISI(31, "Servis Çocuk Kardiyolojisi"),
    SERVIS_COCUK_NOROLOJI(32, "Servis Çocuk Nöroloji"),
    SERVIS_COCUK_HEMATOLOJI_ONKOLOJI(33, "Servis Çocuk Hematoloji / Onkoloji"),
    PSIKIYATRI_SERVISI(120, "Psikiyatri Servisi"),
    NOROLOJI_SERVISI(42, "Nöroloji Servisi"),
    YOGUN_BAKIM_ERISKIN(35, "Yoğun Bakım Erişkin"),
    YOGUN_BAKIM_GENEL(36, "Yoğun Bakım Genel"),
    PALYATIF(37, "Palyatif");

    private final Integer id;
    private final Serializable adi;

    Acil112BransGrubu(Integer id, Serializable adi) {
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
