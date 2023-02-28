/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author metini
 */
public enum CalisilmayanGunTuru implements DbEnum {

    RESMI_TATIL(1, "Resmi Tatil"),
    IDARI_TATİL(2, "İdari Tatil"),
    STOK_SAYIM(3, "Stok Sayım"),
    DIGER(4, "Diğer");

    private final Integer id;
    private final Serializable adi;

    CalisilmayanGunTuru(Integer id, Serializable adi) {
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
