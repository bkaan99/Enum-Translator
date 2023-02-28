package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikAlanDuzen implements DbEnum {

    ABSOLUTE(1, "absolute"),
    ACCORDION(2, "accordion"),
    ANCHOR(3, "anchor"),
    BORDER(4, "border"),
    CARD(5, "card"),
    COLUMN(6, "column"),
    FIT(7, "fit"),
    VBOX(8, "vbox"),
    HBOX(9, "hbox");

    private final Integer id;

    private final Serializable adi;

    DinamikAlanDuzen(Integer id, Serializable adi) {
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
