package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikAlanDuzenYer implements DbEnum {
    
    YUKARI(1, "Yukari"),
    ASAGI(2, "Asağı"),
    SOL(3, "Sol"),
    SAG(4, "Sağ"),
    ORTA(5, "Orta");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikAlanDuzenYer(Integer id, Serializable adi) {
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
