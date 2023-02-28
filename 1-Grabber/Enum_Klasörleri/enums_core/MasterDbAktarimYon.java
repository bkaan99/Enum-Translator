package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum MasterDbAktarimYon implements DbEnum {
    
    MASTER_DB_KURUM(1, "Master DB -> Local DB"),
    KURUM_MASTER_DB(2, "Local DB -> Master DB");
    
    private final Integer id;
    private final Serializable adi;
    
    MasterDbAktarimYon(Integer id, Serializable adi) {
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
