package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum LogicalOperator implements DbEnum {

    /**
     * && (Ve)
     */
    AND("&&", "Ve"),
    /**
     * || (Veya)
     */
    OR("||", "Veya"),
    /**
     * = (Eşit)
     */
    EQUAL("==", "Eşit"),
    /**
     * LIKE (özel)
     */
    LIKE("LIKE", "özel"),
    /**
     * != (Eşit Değil)
     */
    NOT_EQUAL("!=", "Eşit Değil"),
    /**
     * <&lt; (Küçük)
     */
    LESS_THAN("<", "Küçük"),
    /**
     * <&lt;= (Küçük Eşit)
     */
    LESS_THAN_OR_EQUAL("<=", "Küçük Eşit"),
    /**
     * &gt; (Büyük)
     */
    GREATER_THAN(">", "Büyük"),
    /**
     * &gt;= (Büyük Eşit)
     */
    GREATER_THAN_OR_EQUAL(">=", "Büyük Eşit");

    private final Serializable id;
    private final Serializable adi;

    LogicalOperator(Serializable id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

    @Override
    public Serializable getId() {
        return id;
    }
}
