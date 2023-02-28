package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

public enum RumiAy implements DbEnum {

    MART(1, "Mart"),
    NISAN(2, "Nisan"),
    MAYIS(3, "Mayıs"),
    HAZIRAN(4, "Haziran"),
    TEMMUZ(5, "Temmuz"),
    AGUSTOS(6, "Ağustos"),
    EYLUL(7, "Eylül"),
    TESRINIEVVEL(8, "Teşrîn-i evvel"),
    TESRINI_SANI(9, "Teşrîn-i sâni"),
    KANUNIEVVEL(10, "Kânûn-i evvel"),
    KANUNISANI(11, "Kânûn-i sânî"),
    SUBAT(12, "Şubat");
    private final Integer id;
    private final Serializable adi;

    RumiAy(Integer id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }
public static RumiAy getById(Serializable id) {
        for (RumiAy e : values()) {
            if (e.id == id) return e;
        }
        return null;
    }
}
