package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

public enum DataDefinitionType implements DbEnum {

    CREATE(1, "Create"),
    ALTER(2, "Alter"),
    DROP(3, "Drop"),
    DB_INSERT_UPDATE(4, "DB Insert-Update");

    private final Integer id;
    private final Serializable adi;

    DataDefinitionType(Integer id, Serializable adi) {
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
