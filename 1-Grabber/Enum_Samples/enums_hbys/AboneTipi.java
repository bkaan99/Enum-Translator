package tr.com.fonet.hbys.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 *
 * @author osmanumut
 */
public enum AboneTipi implements DbEnum {
    
    DOGALGAZ(1, "Dogalgaz"),
    SU(2, "Su"),
    ELEKTRIK(3, "Elektrik"),
    MEDIKALGAZ(5, "Medikal Gaz"),
    ILETISIM(6, "İletişim"),
    TIBBIATIK(7, "Tıbbi Atık"),
    KIRA(8, "Kira"),
    BENZIN(9, "Benzin"),
    YAKIT(10, "Yakıt"),
    MAZOT(11, "Mazot"),
    FUELOIL(12, "Fuel Oil"),
    TEHLIKELI_ATIK(13, "Tehlikeli Atık"),
    DIGER(4, "Diğer");

    private final Integer id;
    private final Serializable adi;
    
    AboneTipi(Integer id, Serializable adi) {
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
