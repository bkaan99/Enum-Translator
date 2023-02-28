package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author oozgur
 */
public enum MasterDbObjectType implements DbEnum {

    VIEW(1, "View", ""),
    FUNCTION(2, "Function", ""),
    PROCEDURE(3, "Procedure", ""),
    PACKAGE(4, "Package", ""),
    TABLE(5, "Table", ""),
    COLUMN(6, "Column", "");

    private final Integer id;
    private final Serializable adi;
    private Serializable dbName;

    MasterDbObjectType(Integer id, Serializable adi, Serializable dbName) {
        this.id = id;
        this.adi = adi;
        this.dbName = dbName;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

    @Override
    public Integer getId() {
        return id;
    }

    /**
     * @return the dbName
     */
    public Serializable getDbName() {
        return dbName;
    }

    /**
     * @param dbName the dbName to set
     */
    public void setDbName(Serializable dbName) {
        this.dbName = dbName;
    }
}
