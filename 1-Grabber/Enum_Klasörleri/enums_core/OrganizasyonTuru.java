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
 * @author RAkti
 */
public enum OrganizasyonTuru implements DbEnum {

    HASTANE(1, "Hastane"),
    ADSM(2, "Ağız ve Diş Sağlığı Merkezi");

    private final Integer id;
    private final Serializable adi;

    OrganizasyonTuru(Integer id, Serializable adi) {
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
