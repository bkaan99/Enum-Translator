package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 */
public enum ReportType implements DbEnum {
    
    FORM(1, "Formdan oluşturulan raporlar",true),
    LIST(2, "Listeden oluşan raporlar",true),
    XML(3, "Jrxml'den oluşan rapolar",true),
    CODE(4, "Code'dan oluşan raporlar",true),
    BARCODE(5,"Barcode'dan oluşan raporlar",true),
    FORM_LIST(2, "Form ve Listeden oluşan raporlar");
    
    
    private final Integer id;
    private final Serializable adi;
    private final boolean baseType;
    
    ReportType(Integer id, Serializable adi) {
        this.id = id;
        this.adi = adi;
        this.baseType = false;
    }

    private ReportType(Integer id, Serializable adi, boolean baseType) {
        this.id = id;
        this.adi = adi;
        this.baseType = baseType;
    }
    
    
    @Override
    public Serializable getAdi() {
        return adi;
    }
    
    @Override
    public Integer getId() {
        return id;
    }

    public boolean isBaseType() {
        return baseType;
    }
    
}
