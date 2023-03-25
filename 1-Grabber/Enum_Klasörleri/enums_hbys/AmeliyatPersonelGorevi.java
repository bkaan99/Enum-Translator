
package tr.com.common.enums;

import tr.com.core.common.enums.base.DbEnum;

import java.io.Serializable;


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
