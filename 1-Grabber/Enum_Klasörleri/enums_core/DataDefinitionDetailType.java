package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

public enum DataDefinitionDetailType implements DbEnum {

    CREATE_TABLE(1, "Create Table"),
    COLUMN_ADD(2, "Column Add"),
    COLUMN_NAME(3, "Column Name Replace"),
    COLUMN_DATATTYPE(4, "Column DateType Replace"),
    COLUMN_IDENTITY(5, "Column Identity Replace"),
    COLUMN_NULLABLE(6, "Column Nullable Replace"),
    COLUMN_COMENTS(7, "Column Coments Replace"),
    COLUMN_DROP(8, "Column Drop"),
    COLUMN_DEFAULT(9, "Column Default"),
    CONSTRAINT_ADD(10, "Constraint Add"),
    CONSTRAINT_DROP(11, "Constraint Drop"),
    INDEX_ADD(12, "İndex Add"),
    INDEX_DROP(13, "İndex Drop"),
    FOREIGNKEY_ADD(14, "Foreignkey Add"),
    FOREIGNKEY_DROP(15, "Foreignkey Drop"),
    /*

     */
    CREATE_VIEW(16, "Create View"),
    ALTER_VIEW(17, "Alter View"),
    DROP_VIEW(28, "Drop View"),
    CREATE_PROCEDURE(18, "Create Procedure"),
    ALTER_PROCEDURE(19, "Alter Procedure"),
    DROP_PROCEDURE(20, "Drop Procedure"),
    CREATE_FUNCTION(21, "Create Function"),
    ALTER_FUNCTION(22, "Alter Function"),
    DROP_FUNCTION(23, "Drop Function"),
    CREATE_PACKAGE(24, "Create Package"),
    ALTER_PACKAGE(25, "Alter Package"),
    DROP_PACKAGE(26, "Drop Package"),
    DB_INSERT_UPDATE(27, "DB İnsert-Update Script");

    private final Integer id;
    private final Serializable adi;

    DataDefinitionDetailType(Integer id, Serializable adi) {
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
