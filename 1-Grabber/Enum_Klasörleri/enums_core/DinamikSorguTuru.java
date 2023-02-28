package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osmanumut
 */
public enum DinamikSorguTuru implements DbEnum {
    
    ISTATISTIK(1, "İstatistik"),
    LISTE(2, "Liste"),
    DASHBOARD(3, "Dashboard"),
    SECIM_LISTE(4, "Seçim Listesi");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikSorguTuru(Integer id, Serializable adi) {
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
