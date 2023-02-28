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
 * @author muysal
 */
public enum AmeliyatPersonelGorevi implements DbEnum {

    DOKTOR(1, "Doktor"),
    HEMSIRE(2, "Hemşire"),
    TEKNISYEN(3, "Teknisyen"),
    YARDIMCI_PERSONEL(4, "Yardımcı Personel"),
    ANESTEZI_DOKTORU(5, "Anestezi Doktoru"),
    PERFUZYONIST(6,"Perfüzyonist"),
    NEONATOLOG(7,"Neonatolog");


    private final Integer id;
    private final Serializable adi;

    AmeliyatPersonelGorevi(Integer id, Serializable adi) {
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
