package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 * @author aziz.arslan
 */
public enum KanGrubuTuru implements DbEnum {

    O_RH_POZITIF(0, "0 (I) Rh +"),
    O_RH_NEGATIF(1, "0 (I) Rh –"),
    A_RH_POZITIF(3, "A (II) Rh +"),
    A_RH_NEGATIF(4, "A (II) Rh -"),
    B_RH_POZITIF(5, "B (III) Rh +"),
    B_RH_NEGATIF(6, "B (III) Rh -"),
    AB_RH_POZITIF(7, "AB (IV) Rh +"),
    AB_RH_NEGATIF(8, "AB (IV) Rh -"),
    BELIRSIZ(99, "Belirsiz");


    private final Integer id;
    private final Serializable adi;

    KanGrubuTuru(Integer id, Serializable adi) {
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
