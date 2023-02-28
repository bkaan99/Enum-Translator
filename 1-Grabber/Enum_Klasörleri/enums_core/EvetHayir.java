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
public enum EvetHayir implements DbEnum {

    HAYIR(0, "Hayır"),
    EVET(1, "Evet");
    //-----------------------------------
    private final Integer id;
    private final Serializable adi;
    //-----------------------------------

    EvetHayir(Integer id, Serializable adi) {
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
