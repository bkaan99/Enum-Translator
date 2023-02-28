package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mustafa.kus
 */
public enum DinamikRaporSayfaBuyuklugu implements DbEnum {
    
    A4("A4", "A4"),
    A1("A1", "A1"),
    A2("A2", "A2"),
    A3("A3", "A3"),
    A5("A5", "A5"),
    A6("A6", "A6"),
    A7("A7", "A7");
    
    
    private final Serializable id;
    private final Serializable adi;
    
    DinamikRaporSayfaBuyuklugu(Serializable id, Serializable adi) {
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
