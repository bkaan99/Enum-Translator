package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum ReportSummaryType implements DbEnum {

    NO(0, "Yok"),
    AVERAGE(1, "Ortalma"),
    SUM(2, "Toplam"),
    MIN(3, "Minimum"),
    MAX(4, "Maksimum"),
    VARIANCE(5, "Varyant"),
    PERCANTAGE(6, "Yüzde"),
    COUNT(7, "Miktar");

    private final Integer id;
    private final Serializable adi;

    ReportSummaryType(Integer id, Serializable adi) {
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
