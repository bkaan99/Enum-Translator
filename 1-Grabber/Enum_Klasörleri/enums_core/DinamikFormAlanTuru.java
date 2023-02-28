package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osman
 */
public enum DinamikFormAlanTuru implements DbEnum {
    
    METIN_KUTUSU(1, "Metin Kutusu"),
    ACILIR_KUTU(2, "Açılır Kutu"),
    TARIH(3, "Tarih"),
    TARIH_SAAT(4, "Tarih Saat"),
    SAAT(5, "Saat"),
    SECIM_LISTESI(6, "Seçim Listesi"),
    SAYISAL_ALAN(7, "Sayısal Alan"),
    DURUM_ALANI(8, "Durum Alanı"),
    COKLU_SECIM(9, "Çoklu Seçim"),
    ACILIR_KUTU_METIN(10, "Açılır Kutu (METIN)");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikFormAlanTuru(Integer id, Serializable adi) {
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
