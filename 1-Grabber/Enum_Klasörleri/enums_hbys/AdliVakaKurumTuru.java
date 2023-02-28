package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author sgozmen
 */
public enum AdliVakaKurumTuru implements DbEnum {
    
    EMNIYET_AMIRLIGI_MUDURLUGU(1,"EMNİYET AMİRLİĞİ / MÜDÜRLÜĞÜ","EMNİYET AMİRLİĞİNE / MÜDÜRLÜĞÜNE"),
    JANDARMA_KOMUTANLIGINA(2,"JANDARMA KOMUTANLIĞI","JANDARMA KOMUTANLIĞINA"),
    CUMHURIYET_BASSAVCILIGINA(3,"CUMHURİYET BAŞSAVCILIĞI","CUMHURİYET BAŞSAVCILIĞINA");
    
    private final Integer id;
    private final Serializable adi;
    private final Serializable yonlendirmeAciklamasi;
    
    AdliVakaKurumTuru(Integer id, Serializable adi, Serializable yonlendirmeAciklamasi) {
        this.id = id;
        this.adi = adi;
        this.yonlendirmeAciklamasi = yonlendirmeAciklamasi;
    }
    
    @Override
    public Serializable getAdi() {
        return adi;
    }
    
    @Override
    public Integer getId() {
        return id;
    }

    public Serializable getYonlendirmeAciklamasi() {
        return yonlendirmeAciklamasi;
    }
    
    
}
