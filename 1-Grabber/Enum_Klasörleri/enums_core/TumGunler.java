/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author maaynur
 */
public enum TumGunler implements DbEnum {
    TUM_GUNLER(8, "Tüm Günler"),
    PAZARTESI(1, "Pazartesi"),
    SALI(2, "Salı"),
    CARSAMBA(3, "Çarşamba"),
    PERSEMBE(4, "Perşembe"),
    CUMA(5, "Cuma"),
    CUMARTESI(6, "Cumartesi"),
    PAZAR(7, "Pazar");

    private final Integer id;
    private final Serializable adi;

    TumGunler(Integer id, Serializable adi) {
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
