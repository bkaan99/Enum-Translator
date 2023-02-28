package tr.com.fonet.hbys.ris.ejb.rad.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum RisOrderTarihKriter implements DbEnum {

    ISTEM_TARIHI(1, "İstem Tarihi"),
    RANDEVU_TARIHI(2, "Randevu Tarihi"),
    KABUL_TARIHI(3, "Kabul Tarihi"),
    CEKIM_TARIHI(4, "Çekim Onay Tarihi"),
    RAPOR_YAZIM_TARIHI(5, "Rapor Yazım Tarihi"),
    FINAL_TARIHI(6, "Rapor Final Tarihi"),
    RAPOR_ONAY_TARIHI(7, "Rapor Onay Tarihi"),
    CEKIM_BITIS_TARIHI(10, "Çekim Bitiş Tarihi");
  /*  ISTEM_RANDEVU_TAR(8,"İstem + Randevu Tarihi"),
    ATAMA_TARIHI(9,"Atama Tarihi");*/

    private final Integer id;
    private final Serializable adi;

    RisOrderTarihKriter(Integer id, Serializable adi) {
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
