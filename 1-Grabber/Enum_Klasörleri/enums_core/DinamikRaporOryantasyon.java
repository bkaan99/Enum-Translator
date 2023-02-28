package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mustafa.kus
 */
public enum DinamikRaporOryantasyon implements DbEnum {
    
    LANDSCAPE("LANDSCAPE", "Yatay"),
    PORTRAIT("PORTRAIT", "Dikey");
    
    private final Serializable id;
    private final Serializable adi;
    
    DinamikRaporOryantasyon(Serializable id, Serializable adi) {
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
    
    public static DinamikRaporOryantasyon getEnumByID(int idNum){
        
        if (DinamikRaporOryantasyon.LANDSCAPE.getId().equals(idNum)){
            
            return DinamikRaporOryantasyon.LANDSCAPE; 
        }
        else if (DinamikRaporOryantasyon.PORTRAIT.getId().equals(idNum)){
            return DinamikRaporOryantasyon.PORTRAIT;
        }
        else{
            return null;
        }
        
        
    } 
    
}
