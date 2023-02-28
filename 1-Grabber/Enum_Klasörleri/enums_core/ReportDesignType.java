package tr.com.fonet.core.common.enums;

import tr.com.fonet.core.common.enums.base.DbEnum;

import java.io.Serializable;

/**
 * @author osmanumut
 */
public enum ReportDesignType implements DbEnum {

    //CRYSTAL(1, "Crystal Report", "rpt"),
    FASTREPORT(2, "Fast Report", "frx"),
    JASPER(3, "Jasper Report", "jrxml"),
    EXCEL(4, "Excel", "xls"),
    WORD(5, "Word", "docx");

    private final Integer id;
    private final Serializable adi;
    private final Serializable fileExtension;

    private ReportDesignType(Integer id, Serializable adi, Serializable fileExtension) {
        this.id = id;
        this.adi = adi;
        this.fileExtension = fileExtension;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public Serializable getFileExtension() {
        return fileExtension;
    }

}
