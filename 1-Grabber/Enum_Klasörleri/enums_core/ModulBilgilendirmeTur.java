package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum ModulBilgilendirmeTur implements DbEnum {

    GUNCELLEME(1, "Güncelleme"),
    MEVZUAT(2, "Mevzuat");

    private final Integer id;
    private final Serializable adi;

    ModulBilgilendirmeTur(Integer id, Serializable adi) {
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
