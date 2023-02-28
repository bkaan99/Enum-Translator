package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osmanumut
 */
public enum DinamikSorguGrafikTur implements DbEnum {
    
    SUTUN(1, "Sütun"),
    CUBUK(2, "Çubuk"),
    CIZGI(3, "Çizgi"),
    PASTA(4, "Pasta"),
    NOKTA(5, "Nokta"),
    ALAN(6, "Alan");
    
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikSorguGrafikTur(Integer id, Serializable adi) {
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
