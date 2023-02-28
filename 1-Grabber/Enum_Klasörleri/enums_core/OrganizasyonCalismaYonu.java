package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

public enum OrganizasyonCalismaYonu implements DbEnum {

    /**
     * Kullanıcının login olduğu organizasyon ve üst Organizasyon bilgisini
     * temsil eder.<br>
     * Örn:Kullanıcı,Organizasyon seviyesi Seviye3 olan KURUM3 den login
     * olduğunda <br>
     * Login olduğu KURUM3<br>
     * KURUM3'nın üst Organizasyonu olan KURUM2<br>
     * KURUM2'nin üst Organizasyonu olan KURUM1'e ait kayıtları listelenecektir.
     */
    /**
     * Kullanıcının login olduğu organizasyon ve üst Organizasyon bilgisini
     * temsil eder.<br>
     * Örn:Kullanıcı,Organizasyon seviyesi Seviye3 olan KURUM3 den login
     * olduğunda <br>
     * Login olduğu KURUM3<br>
     * KURUM3'nın üst Organizasyonu olan KURUM2<br>
     * KURUM2'nin üst Organizasyonu olan KURUM1'e ait kayıtları listelenecektir.
     */
    YUKARI(1, "Yukarı"),
    /**
     * Kullanıcının login olduğu organizasyon ve alt Organizasyonları temsil
     * eder.<br>
     * Örn:Kullanıcı,Organizasyon seviyesi Seviye3 olan KURUM3 den login
     * olduğunda <br>
     * Login olduğu KURUM3,<br>
     * KURUM3'ün alt Organizasyonları ve onlarında alt Organizasyonları şeklinde
     * en alt Organizasyona kadar tüm alt Organizasyonlara ait kayıtları
     * listeler
     */
    ASAGI(2, "Aşağı"),
    /**
     * Kullanıcının login olduğu Organizasyan'la ilişkili tüm seviyeleri temsil
     * eder.<br>
     */
    ASAGI_YUKARI(3, "Yukarı Aşağı");

    private final Integer id;
    private final Serializable adi;

    OrganizasyonCalismaYonu(Integer id, Serializable adi) {
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
