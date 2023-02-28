/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author burhan akar
 */

public enum AmeliyatNotSablonTur implements DbEnum {

    AMELIYAT_NOTU(1, "SIKAYET"),
    AMELIYAT_KOMPLIKASYONU(2, "HIKAYE"),
    ANESTEZI_NOTU(3, "PATOLOJI"),
    ANESTEZI_KOMPLIKASYONU(4, "MEVCUT_ILAC");
//-----------------------------------
    private final Integer id;
    private final Serializable adi;
//-----------------------------------

    AmeliyatNotSablonTur(Integer id, Serializable adi) {
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
