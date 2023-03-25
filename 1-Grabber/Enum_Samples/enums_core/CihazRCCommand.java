package tr.com.core.common.enums;

import java.io.Serializable;
import tr.com.common.enums.base.DbEnum;


public enum CihazRCCommand implements DbEnum {
    
    RESTART(1, "Cihazı Restart Et", "RST"),
    GETURL(2, "Mevcut URL", "GETURL"),
    OPENURL(3, "Mevcut URL Değiştir", "OPENURL"),
    LOG(4,"Cihaz üzerinde bilgi notu göster", "UNP"),
    TIME(5, "Cihaz saati", "TIME"),
    LANG(6, "Cihaz Dilini TÜRKÇE'ye çevir", "CHANGELNG 0 25"),
    SS(7, "Anlık ekran görüntüsü", "screen_capture_usb 8"),
    GETSTARTURL(8, "Başlangıç URL", "GETSTARTURL"),    
    SETSTARTURL(9, "Başlangıç URL değiştir", "SETSTARTURL");
    
    private final Integer id;
    private final Serializable adi;
    private final String comm;
    
    CihazRCCommand(Integer id, Serializable adi, String comm) {
        this.id = id;
        this.adi = adi;
        this.comm = comm;
    }
    
    @Override
    public Serializable getAdi() {
        return adi;
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    public String getComm() {
        return comm;
    }
    
}
