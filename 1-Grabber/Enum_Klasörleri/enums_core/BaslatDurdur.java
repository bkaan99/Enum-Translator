package tr.core.common.enums;

import java.io.Serializable;
import tr.com.common.enums.base.DbEnum;


public enum BaslatDurdur implements DbEnum {
    
    BASLAT(1, "Başlat"),
    DURDUR(2, "Durdur");
    
    private final Integer id;
    private final Serializable adi;
    
    BaslatDurdur(Integer id, Serializable adi) {
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
