package tr.com.lis.enums;

import java.io.Serializable;
import tr.com.core.common.enums.base.DbEnum;

public enum LisRandevuDurum implements DbEnum {

    TUMU(-1, "Tümü"),
    RANDEVU_VERILMIS(1, "Verilmiş"),
    RANDEVU_VERILMEMIS(2, "Verilmemiş");

    private final Integer id;
    private final Serializable adi;

    LisRandevuDurum(Integer id, Serializable adi) {
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
