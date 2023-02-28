package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 * Yazılacak logun hangi alanla(Restfull,SQL,XML Servis) ilgili olduğu bu enumdan belirtilir.<br>
 * @author myalcinkaya
 * 
 */
public enum UserLogType implements DbEnum {
    
    /**
     * Rs Isteklerin Logları
     */
    RS_LOG(1, "Restfull Log"),

    /**
     * XML ve Diğer Gönderim Logları
     */
    INTEGRATION_LOG(2, "Integration Log"),

    /**
     *Module logları
     */
    TRACE_LOG(3, "Trace Log"),

    /**
     *Tüm sqllerin logları
     */
    SQL_LOG(4, "Sql log"),
    /**
     *Module logları
     */
    EXCEPTION_LOG(5, "Exception Log");
    
    
    
    private final Integer id;
    private final Serializable adi;
    
    UserLogType(Integer id, Serializable adi) {
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
