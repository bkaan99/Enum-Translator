package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum SessionProfileActionType implements DbEnum {
    
    USER(0, "User",false),
    TIMER(1, "Timer",false),
    INFO(2, "Info",true),
    COUNTER(3, "Counter",true);
    
    private final Integer id;
    private final Serializable adi;
    private boolean valueChangeAction;
    
    SessionProfileActionType(Integer id, Serializable adi,boolean valueChangeAction) {
        this.id = id;
        this.adi = adi;
        this.valueChangeAction = valueChangeAction;
    }
    
    @Override
    public Serializable getAdi() {
        return adi;
    }
    
    @Override
    public Integer getId() {
        return id;
    }

    public boolean isValueChangeAction() {
        return valueChangeAction;
    }
    
}
