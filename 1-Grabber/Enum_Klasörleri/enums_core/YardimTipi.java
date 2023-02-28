package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author samet uymaz
 */
public enum YardimTipi implements DbEnum {
    
    PDF(1, "Pdf"),
    VIDEO(2, "Video"),
    METIN(3, "Metin");
    
    private final Integer id;
    private final Serializable adi;
    
    YardimTipi(Integer id, Serializable adi) {
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
