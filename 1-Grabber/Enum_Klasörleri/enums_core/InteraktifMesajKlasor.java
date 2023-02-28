package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author egazan
 */
public enum InteraktifMesajKlasor implements DbEnum {

    GELEN_MESAJ(1, "Gelen Mesaj"),
    GIDEN_MESAJ(2, "Giden Mesaj"),
    BILGILENDIRME(3, "Bilgilendirme");

    private final Integer id;
    private final Serializable adi;

    InteraktifMesajKlasor(Integer id, Serializable adi) {
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
