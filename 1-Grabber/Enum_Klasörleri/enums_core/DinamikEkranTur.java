package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author osman
 */
public enum DinamikEkranTur implements DbEnum {
    
    FORM(1, "Form"),
    LISTE(2, "Liste"),
    KAYIT_FORM(3, "Kayıt Form"),
    KRITER_PANEL(4, "Kayıt Form");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikEkranTur(Integer id, Serializable adi) {
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
