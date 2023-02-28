package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author egazan
 */
public enum Aglama implements DbEnum {
    
    SESSIZ(0, "Sessiz,ağlamıyor,uyuyor ya da uyanık"),
    UYSAL(1, "uysal inleme,aralıklı ağlama ve şikayetçi olma"),
    ENTUBE(2, "(entübe değilse) Devam eden gürültülü bağırma,çığlık.(entübe ise)Yüz hareketlerinden anlaşılan sessiz ağlama");
    
    private final Integer id;
    private final Serializable adi;
    
    Aglama(Integer id, Serializable adi) {
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
