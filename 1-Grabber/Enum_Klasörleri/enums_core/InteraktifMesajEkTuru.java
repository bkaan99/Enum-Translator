package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum InteraktifMesajEkTuru implements DbEnum {

    PNG(1, "Resim Dosyası(.png)"),
    JPEG(2, "Resim Dosyası(.jpeg)"),
    WORD(3, "Word Dosyası"),
    EXCEL(4, "Excel Dosyası"),
    PDF(5, "PDF Dosyası");

    private final Integer id;
    private final Serializable adi;

    InteraktifMesajEkTuru(Integer id, Serializable adi) {
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
