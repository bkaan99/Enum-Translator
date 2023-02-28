package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum AmeliyatIptalErtelemeNedenleri implements DbEnum {

    MALZEME_YOKLUGU(1, "Malzeme Yokluğu"),
    PREOP_HAZIRLIGI(2, "Preop Hazırlığının Tamamlanmaması"),
    HASTANIN_AMELIYATA_GELMEMESI(3, "Hastanın Ameliyata Gelmemesi"),
    AMELIYAT_SURESININ_UZAMASI(4, "Listede Bulunan Ameliyat Süresinin Uzaması"),
    DIGER_NEDENLER(5, "Diğer Nedenler");

    private final Integer id;
    private final Serializable adi;

    AmeliyatIptalErtelemeNedenleri(Integer id, Serializable adi) {
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
