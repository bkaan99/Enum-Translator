/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author muysal
 */
public enum KullaniciRol implements DbEnum {

    // Order a göre compare yapmak için yetki seviyesine göre sıralı eklenmeli
    SISTEM_ADMIN(1, "Sistem Yöneticisi"),
    KURUM_ADMIN(2, "Kurum Yöneticisi"),
    NODE_USER(3, "Sunucu-Kullanıcı Grubu"),
    USER(0, "Kullanıcı");

    private final Integer id;
    private final Serializable adi;

    KullaniciRol(Integer id, Serializable adi) {
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

    public boolean isAdmin() {
        return isSistemAdmin() || isKurumAdmin();
    }

    public boolean isSistemAdmin() {
        return this.equals(SISTEM_ADMIN);
    }

    public boolean isKurumAdmin() {
        return this.equals(KURUM_ADMIN);
    }

}
