package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osman
 */
public enum DinamikEkranPanelTur implements DbEnum {
    
    KONTEYNER(1, "Konteyner"),
    PANEL(2, "Panel"),
    TAB_PANEL(3, "Tab Panel");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikEkranPanelTur(Integer id, Serializable adi) {
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
