package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikSorguOzetTuru implements DbEnum {

    NO(0, "Yok"),
    AVERAGE(1, "Ortalma"),
    SUM(2, "Toplam"),
    MIN(3, "Minimum"),
    MAX(4, "Maksimum"),
    VARIANCE(5, "Varyant"),
    PERCANTAGE(6, "Yüzde"),
    COUNT(7, "Miktar"),
    ALL_AVERAGE(8, "Tüm Ortalma"),
    ALL_SUM(9, "Tüm Toplam"),
    ALL_MIN(10, "Tüm Minimum"),
    ALL_MAX(11, "Tüm Maksimum"),
    ALL_VARIANCE(12, "Tüm Varyant"),
    ALL_PERCANTAGE(13, "Tüm Yüzde"),
    ALL_COUNT(14, "Tüm Miktar");

    private final Integer id;

    private final Serializable adi;

    DinamikSorguOzetTuru(Integer id, Serializable adi) {
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
