package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author mxxyalcinkaya
 */
public enum WebBrowserType implements DbEnum {
    
    CHROME(1, "chrome"),
    FIREFOX(2, "firefox"),
    SAFARI(3, "safari"),
    OPERA(4, "oprea"),
    NETSPACE(5, "netspace"),
    INTERNET_EXPLORER(6, "iexplore"),
    EDGE(7, "edge");
    
    private final Integer id;
    private final Serializable adi;
    
    WebBrowserType(Integer id, Serializable adi) {
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
