package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum SystemLogLevelType implements DbEnum {

    TRACE(1, "Trace",SystemLogStreamType.NORMAL),
    DEBUG(2, "Debug",SystemLogStreamType.NORMAL),
    INFO(3, "Info",SystemLogStreamType.NORMAL),
    NOTICE(4, "Notice",SystemLogStreamType.NORMAL),
    WARNING(5, "Warning",SystemLogStreamType.ERROR),
    FATAL(6, "Fatal",SystemLogStreamType.ERROR);

    private final Integer id;
    private final Serializable adi;
    private final SystemLogStreamType error;

    SystemLogLevelType(Integer id, Serializable adi, SystemLogStreamType error) {
        this.id = id;
        this.adi = adi;
        this.error = error;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public SystemLogStreamType getError() {
        return error;
    }

    
}
