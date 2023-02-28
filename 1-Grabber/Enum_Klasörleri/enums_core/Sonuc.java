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
public enum Sonuc implements DbEnum {

    BASARISIZ(0, "Başarısız"),
    BASARILI(1, "Başarılı");
    //-----------------------------------
    private final Integer id;
    private final Serializable adi;
    //-----------------------------------

    Sonuc(Integer id, Serializable adi) {
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
