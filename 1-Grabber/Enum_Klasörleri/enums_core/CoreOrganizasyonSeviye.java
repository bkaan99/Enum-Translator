/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.OrganizasyonSeviyeEnum;

/**
 *
 * @author emre
 */
public enum CoreOrganizasyonSeviye implements OrganizasyonSeviyeEnum {

    SEVIYE1(1, "Seviye 1"),
    SEVIYE2(2, "Seviye 2"),
    SEVIYE3(3, "Seviye 3"),
    SEVIYE4(4, "Seviye 4"),
    SEVIYE5(5, "Seviye 5");

    private final Integer id;
    private final Serializable adi;

    CoreOrganizasyonSeviye(Integer id, Serializable adi) {
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
