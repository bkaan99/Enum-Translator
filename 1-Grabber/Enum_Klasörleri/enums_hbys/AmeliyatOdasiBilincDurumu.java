package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum AmeliyatOdasiBilincDurumu implements DbEnum {

    BILINCI_ACIK(1, "Bilinci Açık"),
    UYKULU(2, "Uykulu"),
    YARI_UYANIK(3, "Yarı Uyanık"),
    KENDINDE(4, "Kendinde"),
    KARISIK(5, "Karışık"),
    BILINCSIZ(6, "Bilinçsiz"),
    NOBET(7, "Nöbet");

    private final Integer id;
    private final Serializable adi;

    AmeliyatOdasiBilincDurumu(Integer id, Serializable adi) {
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
