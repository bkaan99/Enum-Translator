package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum AmeliyatGorevi implements DbEnum {
    TEKDOKTOR(1, "Tek Doktor"),
    BIRINCI_2X(2, "Birinci-2X"),
    IKINCI_2X(3, "İkinci-2X"),
    BIRINCI_3X(4, "Birinci-3X"),
    IKINCI_3X(5, "İkinci-3X"),
    UCUNCU_3X(6, "Üçüncü-3X"),
    DIGER(7, "Diğer"),
    ANESTEZI(8, "Anestezi Doktoru"),
    PERFUZYONIST(9, "Perfüzyonist")
    ;

    private final Integer id;
    private final Serializable adi;

    AmeliyatGorevi(Integer id, Serializable adi) {
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
