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
 * @author mguzel
 */
public enum KanGrubu implements DbEnum {

    BELIRSIZ(0, "Belirsiz", ""),
    A_POZITIF(1, "A Rh(+)", "A_RH_Pozitif"),
    A_NEGATIF(2, "A Rh(-)", "A_RH_Negatif"),
    B_POZITIF(3, "B Rh(+)", "B_RH_Pozitif"),
    B_NEGATIF(4, "B Rh(-)", "B_RH_Negatif"),
    AB_POZITIF(5, "AB Rh(+)", "AB_RH_Pozitif"),
    AB_NEGATIF(6, "AB Rh(-)", "AB_RH_Negatif"),
    SIFIR_POZITIF(7, "0 Rh(+)", "O_RH_Pozitif"),
    SIFIR_NEGATIF(8, "0 Rh(-)", "O_RH_Negatif");

    private final Integer id;
    private final Serializable adi;
    private final Serializable kizilayKanGrubu;

    KanGrubu(Integer id, Serializable adi, Serializable kizilayKanGrubu) {
        this.id = id;
        this.adi = adi;
        this.kizilayKanGrubu = kizilayKanGrubu;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

    @Override
    public Integer getId() {
        return id;
    }
    
    public Serializable getKizilayKanGrubu(){
        return kizilayKanGrubu;
    }

}
