package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikSorguAlanTuru implements DbEnum {

    TEXT(1, "Metin Kutusu"),
    COMBO(2, "Açılır Kutu"),
    DATE(3, "Tarih"),
    SELECTLIST(4, "Seçim Listesi"),
    DATETIME(5, "Tarih Saat"),
    NUMBER(6, "Sayısal Alan"),
    DURUM(7, "Durum Alanı"),
    CHECKCOMBO(8, "Çoklu Seçim"),
    COMBOSTR(9, "Açılır Kutu (METIN)"),
    BLOB(10,"Resim"),
    TIME(11,"Saat"),
    MONEY(12,"Para");
    private final Integer id;
    private final Serializable adi;

    DinamikSorguAlanTuru(Integer id, Serializable adi) {
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
