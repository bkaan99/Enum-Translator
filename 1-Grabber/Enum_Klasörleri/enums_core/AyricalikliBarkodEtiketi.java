package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

public enum AyricalikliBarkodEtiketi implements DbEnum {

    LIS_BARKODU("testhakan", "Lis Barkodu"),
    HASTA_BILEKLIK("HastaBileklik", "Hasta Bileklik"),
    YATIS_BARKODU("YatisBarkodu", "Yatış Barkodu"),
    MUAYENE_BARKODU("MuayeneBarkodu", "Muayene Barkodu");

    private final Serializable id;
    private final Serializable adi;

    AyricalikliBarkodEtiketi(Serializable id, Serializable adi) {
        this.id = id;
        this.adi = adi;
    }

    @Override
    public Serializable getId() {
        return id;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

    public static AyricalikliBarkodEtiketi getById(Serializable id) {
        for (AyricalikliBarkodEtiketi e : values()) {
            if (e.id == id) return e;
        }
        return null;
    }
}
