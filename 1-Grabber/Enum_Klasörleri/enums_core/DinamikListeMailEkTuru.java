package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum DinamikListeMailEkTuru implements DbEnum {

    
    XLSX(3, "Excel"),
    PDF(4, "PDF"),
    DOCX(6, "Word");

    private final Integer id;
    private final Serializable adi;

    DinamikListeMailEkTuru(Integer id, Serializable adi) {
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
