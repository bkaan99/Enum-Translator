package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikEkranAlanVarsayilanDegerTur implements DbEnum {
    
    SAYISAL(1, "Sayisal"),
    METIN(2, "Metin"),
    TARIH(3, "Tarih");
    
    private final Integer id;
    private final Serializable adi;
    
    DinamikEkranAlanVarsayilanDegerTur(Integer id, Serializable adi) {
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
