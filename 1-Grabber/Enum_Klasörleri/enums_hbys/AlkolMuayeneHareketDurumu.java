package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author metini
 */
public enum AlkolMuayeneHareketDurumu implements DbEnum {
    SIFIR(0,"0"),
    BIR(1, "1"),
    IKI(2, "2"),
    UC(3, "3"),
    DORT(4, "4"),
    BES(5, "5"),
    ALTI(6, "6"),
    YEDI(7, "7"),
    SEKIZ(8, "8"),
    DOKUZ(9, "9"),
    ON(10, "10");

    private final Integer id;
    private final Serializable adi;

    AlkolMuayeneHareketDurumu(Integer id, Serializable adi) {
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
