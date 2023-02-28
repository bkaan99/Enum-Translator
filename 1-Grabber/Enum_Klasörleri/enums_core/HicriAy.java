package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

public enum HicriAy implements DbEnum {

    MUHARREM(1, "Muharrem(1)"),
    SAFER(2, "Safer(2)"),
    REBIULEVVEL(3, "Rebiül Evvel(3)"),
    REBIULAHIR(4, "Rebiül Ahir(4)"),
    CEMAZIYELEVVEL(5, "Cemaziyel Evvel(5)"),
    CEMAZIYELAHIR(6, "Cemzaziyel Ahir(6)"),
    RECEB(7, "Recep(7)"),
    SABAN(8, "Şaban(8)"),
    RAMAZAN(9, "Ramazan(9)"),
    SEVVAL(10, "Şevval(10)"),
    ZILKADE(11, "Zilkade(11)"),
    ZILHACCE(12, "Zilhacce(12)");
    private final Integer id;
    private final Serializable adi;

    HicriAy(Integer id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }
public static HicriAy getById(Serializable id) {
        for (HicriAy e : values()) {
            if (e.id == id) return e;
        }
        return null;
    }
}
