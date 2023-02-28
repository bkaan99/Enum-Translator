package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikAlanTuru implements DbEnum {

    TEXT(1, "Metin Kutusu"),
    COMBO(2, "Açılır Kutu"),
    DATE(3, "Tarih"),
    SELECTLIST(4, "Seçim Listesi"),
    DATETIME(5, "Tarih Saat"),
    NUMBER(6, "Sayısal Alan"),
    DURUM(7, "Durum Alanı"),
    CHECKCOMBO(8, "Çoklu Seçim"),
    COMBOSTR(9, "Açılır Kutu (METIN)"),
    CONTAINER(10, "Konteyner"),
    PANEL(11, "Panel"),
    GROUPPANEL(12, "Grup Panel"),
    TEXTAREA(13, "Geniş Metin Kutusu"),
    TABPANEL(14, "Tab Panel"),
    IMAGE(15, "Görsel Ekle");

    private final Integer id;
    private final Serializable adi;

    DinamikAlanTuru(Integer id, Serializable adi) {
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
