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
//@JsonDeserialize(using = KullaniciGrupUyelikTipiDeserializer.class)
//@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum KullaniciGrupUyelikTipi implements DbEnum {

    TARIH_KISITLI(1, "Tarih Kısıtlı"),
    GUN_KISITLI(2, "Gün Kısıtlı");
    private final Integer id;
    private final Serializable adi;

    KullaniciGrupUyelikTipi(Integer id, Serializable adi) {
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

//    @JsonCreator
//    private KullaniciGrupUyelikTipi setId(String id) {
//        return DbEnumUtils.getDbEnum(KullaniciGrupUyelikTipi.class, id);
//    }


}
