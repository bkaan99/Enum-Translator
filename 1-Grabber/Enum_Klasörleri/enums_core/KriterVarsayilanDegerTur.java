package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum KriterVarsayilanDegerTur implements DbEnum {

    TARIH(1, "Tarih"),
    METIN(2, "Metin"),
    SAYISAL_ALAN(3, "Sayısal"),
    AY_BASI(4, "Ayın Başlangıcı"),
    AY_SONU(5, "Ayın Sonu"),
    TARIH_SAAT(6, "Tarih Saat"),
    AKTIF_ORGANIZASYON(7, "Aktif Organizasyon"),
    AKTIF_ORGANIZASYON_ALTI(8, "Aktif Organizasyon ve Altı"),
    AKTIF_KULLANICI(9, "Aktif Kullanici"),
    AKTIF_KULLANICI_ORGANIZASYON(10, "Aktif Kullanici Organizasyon");
    private final Integer id;
    private final Serializable adi;

    KriterVarsayilanDegerTur(Integer id, Serializable adi) {
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
