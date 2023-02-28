package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum SifreDurum implements DbEnum {

    SIFRESIZ(0, "Şifresiz", false),
    SIFRELI(1, "Şifreli", false),
    DEGISTIRILECEK(2, "Değiştirilecek", true),
    DEGISTIRILECEK_GUNCELLEME(4, "Değiştirilecek Guncelleme", true),
    DEGISTIRILECEK_SURE_DOLSMUS(5, "Değiştirilecek Sifre Degistirme Zamanı Gelmiş", true);

    private final Integer id;
    private final Serializable adi;
    private final Boolean degistirilmeli;

    SifreDurum(Integer id, Serializable adi, Boolean degistirilmeli) {
        this.id = id;
        this.adi = adi;
        this.degistirilmeli = degistirilmeli;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public Boolean isDegistirilmeli() {
        return degistirilmeli;
    }

}
