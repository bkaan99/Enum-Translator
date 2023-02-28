package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author selim.surucu
 */
public enum AmeliyatBeklenmeyenDonus implements DbEnum {

    HASTAKAYNAKLI(1, "Hasta Kaynaklı"),
    CALISANKAYNAKLI(2, "Çalışan Kaynaklı"),
    MALZEMEKAYNAKLI(3, "Malzeme Kaynaklı"),
    DIGER(4, "Diğer"),
    YOK(5, "Yok");

    private final Integer id;
    private final Serializable adi;

    AmeliyatBeklenmeyenDonus(Integer id, Serializable adi) {
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
