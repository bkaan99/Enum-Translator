package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleNorolojiDurumu implements DbEnum {
    
    ATAKSI(1,"Ataksi"),
    BILINC_KAYBI(2,"Bilinç kaybı"),
    BAS_DONMESI(3,"Baş dönmesi"),
    BILINC_BOZUKLUGU(4,"Bilinç Bozukluğu"),
    DISPAJI(5,"Dispaji"),
    GUCSUZLUK(6, "Güçsüzlük"),
    INKONTINANS(7, "İnkontinans"),
    KASILMA(8,"Kasılma"),
    NOBET(9,"Nöbet");

    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleNorolojiDurumu(Integer id, Serializable adi) {
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
