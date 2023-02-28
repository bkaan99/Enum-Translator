/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author muysal
 */
public enum KayitIslemTuru implements DbEnum {

    EKLEME(1, "Ekleme"),
    GUNCELLEME(2, "Güncelleme"),
    SILME(3, "Silme");

    private final Integer id;
    private final Serializable adi;

    KayitIslemTuru(Integer id, Serializable adi) {
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
}
