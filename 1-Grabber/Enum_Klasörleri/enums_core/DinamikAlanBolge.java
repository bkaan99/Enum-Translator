package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikAlanBolge implements DbEnum {

    NORTH(1, "North"),
    WEST(2, "West"),
    SOUTH(3, "South"),
    EAST(4, "East");

    private final Integer id;
    private final Serializable adi;

    DinamikAlanBolge(Integer id, Serializable adi) {
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
