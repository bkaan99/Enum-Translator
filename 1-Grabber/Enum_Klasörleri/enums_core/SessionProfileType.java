package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum SessionProfileType implements DbEnum {
    
    START_OPERATION(1, "Start Operation"),
    END_OPERATION(2, "End Operation"),
    EXECUTION_QUERY_START(3, "Execution Query Finish"),    
    EXECUTION_QUERY_FINISH(4, "Execution Query Finish"),    
    OCCURED(5, "Occured"),
    UPDATED(6, "Occured");
    
    
    private final Integer id;
    private final Serializable adi;
    
    SessionProfileType(Integer id, Serializable adi) {
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
