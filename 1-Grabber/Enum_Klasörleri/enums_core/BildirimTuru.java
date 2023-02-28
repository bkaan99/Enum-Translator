package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author egazan
 */
public enum BildirimTuru implements DbEnum {

    GORUS_ONERI(1, "Görüş Öneri"),
    ISTEK(2, "İstek"),
    SIKAYET(3, "Şikayet"),
    TESEKKUR(4, "Teşekkür"),
    DIGER(5, "Diğer");

    private final Integer id;
    private final Serializable adi;

    BildirimTuru(Integer id, Serializable adi) {
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
