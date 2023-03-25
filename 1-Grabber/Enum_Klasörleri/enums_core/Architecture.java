package tr.com.core.common.enums;

import java.io.Serializable;
import tr.com.core.common.enums.base.DbEnum;


public enum Architecture implements DbEnum {
    
    X86(1, "x86"),
    X64(2, "x64");
    
    private final Integer id;
    private final Serializable adi;
    
    Architecture(Integer id, Serializable adi) {
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
