package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author ahu.ergin
 */
public enum AcilMudahaleBasBoyunDurumu implements DbEnum {
    
    BAS_AGRISI(1, "Baş ağrısı"),
    BOGAZ_AGRISI(2, "Boğaz ağrısı"),
    BOYUNDA_SISLIK(3,"Boyunda şişlik"),
    BURUN_AKINTISI(4,"Burun akıntısı"),
    BURUN_KANAMASI(5,"Burun kanaması"),
    YUTMA_GUCLUGU(6,"Yutma güçlüğü"),
    KULAK_AKINTISI(7,"Kulak akıntısı"),
    KULAK_CINLAMASI(8,"Kulak çınlaması"),
    KULAK_AGRISI(9,"Kulak ağrısı"),
    KULAKTA_KASINTI(10,"Kulakta kaşıntı"),
    ISITME_KAYBI(11,"İşitme kaybı"),
    CIFT_GORME(12,"Çift görme"),
    GOZ_AGRISI(13,"Göz ağrısı"),
    GOZ_AKINTISI(14,"Göz akıntısı"),
    GORME_KAYBI(15,"Görme kaybı"),
    KIRMIZI_GOZ(16,"Kırmızı göz"),
    GENIZ_AKINTISI(17,"Geniz akıntısı");
   
   
   
  
    
    private final Integer id;
    private final Serializable adi;
    
    AcilMudahaleBasBoyunDurumu(Integer id, Serializable adi) {
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
