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
 * @author mustafa.kus
 */
public enum DinamikRaporSablonTipi implements DbEnum {
    
   reportTemplate("reportTemplate","Rapor Şablonu");
    
    
    private final Serializable id;
    private final Serializable adi;
    
    DinamikRaporSablonTipi(Serializable id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }
    
    @Override
    public Serializable getAdi() {
        return adi;
    }
    
    @Override
    public Serializable getId() {
        return id;
    }
}

