package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum TimerJobTimesEventType implements DbEnum {
    
    LOG(1, "Kayıtlı Planlar"),
    EXECUTE_PLAN(2, "Günlük Çalıştırılma Planları"),
    TIMER_JOB_LIST(3, "Bütün Görevler");
    
    private final Integer id;
    private final Serializable adi;
    
    TimerJobTimesEventType(Integer id, Serializable adi) {
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
