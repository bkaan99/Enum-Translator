package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author eaci
 */
public enum AfetOlayVatandasTipi implements DbEnum {

    POLIS(1, "Polis"),
    ASKER(2, "Asker"),
    RESMI_GOREVLI(3, "Resmi Görevli"),
    SIVIL(4, "Sivil");

    private final Integer id;
    private final Serializable adi;

    AfetOlayVatandasTipi(Integer id, Serializable adi) {
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
