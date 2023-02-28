package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import tr.com.fonet.core.common.enums.base.DbEnum;

/**
 *
 * @author myalcinkaya
 * @see http://www.freeformatter.com/mime-types-list.html
 * @see http://www.ietf.org/rfc/rfc2046.txt
 */
public enum FileType implements DbEnum {

    TXT(1, "TXT", "text/plain; charset=UTF-8", true),
    XLS(2, "XLS", "application/vnd.ms-excel"),
    XLSX(3, "XLSX", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),
    PDF(4, "PDF", "application/pdf"),
    DOC(5, "DOC", "application/msword"),
    DOCX(6, "DOCX", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"),
    PPT(7, "PPT", "application/vnd.ms-powerpoint"),
    PPS(8, "PPS", "application/vnd.ms-powerpoint"),
    PPTX(9, "PPTX", "application/vnd.openxmlformats-officedocument.presentationml.presentation"),
    PPSX(10, "PPSX", "application/vnd.openxmlformats-officedocument.presentationml.slideshow"),
    JRXML(11, "JRXML", "application/xml", true),
    XML(12, "XML", "application/xml; charset=UTF-8", true), //default: charset=iso-8859-1
    /**
     * <br>MimeType: text/xml default character set: US-ASCII</br>
     * <br>Turkish character set:ISO-8859-1 </br>
     * <br>This character set :UTF-8 This ignored</br>
     * <br><code><?xml version="1.0" encoding="UTF-8"?></code></br>
     * <br><code><?xml version="1.0" encoding="US-ASCII"?></code></br>
     */
    TXML(13, "XML", "text/xml; charset=UTF-8", true),
    JPG(14, "JPG", "image/jpeg"),
    JPEG(15, "JPEG", "image/jpeg"),
    PNG(16, "PNG", "image/png"),
    GIF(17, "GIF", "image/gif"),
    HTML(18, "HTML", "text/html"),
    SHTML(19, "SHTML", "text/html", true),
    XHTML(20, "XHTML", "application/xhtml+xml", true),
    /**
     * Uml models
     */
    CLAY(21, "CLAY", "text/xml", true),
    CSS(22, "CSS", "text/css", true),
    CSV(23, "CSV", "text/csv", true),
    DTD(24, "DTD", "application/xml-dtd"),
    XSLT(25, "XSLT", "application/xslt+xml"),
    XSL(26, "XSL", "text/xml", true),
    BMP(27, "BMP", "image/bmp"),
    TIF(28, "TIF", "image/tifF"),
    TIFF(29, "TIFF", "image/tiff"),
    ICO(30, "ICO", "image/x-icon"),
    JS(31, "JS", "application/javascript", true),
    JSON(32, "JSON", "application/json", true),
    JAR(33, "JAR", "application/java-archive"),
    CLASS(34, "CLASS", "application/java-vm"),
    JNLP(35, "JNLP", "application/x-java-jnlp-fil", true),
    /**
     * Java serialized object
     */
    SER(36, "SER", "application/java-serialized-object"),
    JAVA(37, "JAVA", "text/x-java-source", true),
    JODA(38, "JODA", " application/vnd.joost.joda-archive"),
    MP3(39, "MP3", "application/mpeg", false, true, false),
    WAV(40, "WAV", "audio/wav", false, true, false),
    RA(41, "RA", "audio/x-realaudio", false, true, false),
    /**
     * Jpg video
     */
    JPM(42, "JPM", "video/jpm", false, false, true),
    JPGV(43, "JPGV", "video/jpeg", false, false, true),
    WM(44, "WM", "video/x-ms-wm", false, false, true),
    WMA(45, "WMA", "audio/x-ms-wm", false, true, false),
    WAX(46, "WAX", "audio/x-ms-wax", false, true, false),
    WMX(47, "WMX", "video/x-ms-wm", false, false, true),
    H261(48, "H261", "video/h261", false, false, true),
    H263(49, "H263", "video/h263", false, false, true),
    H264(50, "H264", "video/h264", false, false, true),
    AVI(51, "AVI", "application/x-msvideo"),
    MOV(52, "MOV", "application/x-quicktime"),
    QT(53, "QT", "application/x-quicktime"),
    F4V(54, "F4V", "video/x-f4v", false, false, true),
    FLV(55, "FLV", "video/x-flv", false, false, true),
    MP4A(56, "MP4A", "audio/mp4", false, true, false),
    MP4(57, "MP4", "video/mp4", false, false, true),
    MP4_V(58, "MP4_V", "application/mp4"),
    SWF(59, "SWF", "application/x-shockwave-flash"),
    RTF(60, "RTF", "application/rtf", true),
    RTX(61, "RTX", "text/richtext", true),
    GTAR(62, "GTAR", "application/x-gtar"),
    GZIP(63, "GZIP", "application/gzip"),
    GZ(64, "GZ", "application/gzip"),
    RPM(65, "RPM", "application/x-redhat-package-manager"),
    TAR(66, "TAR", "application/x-tar"),
    TGZ(67, "TGZ", "application/x-gtar"),
    _7Z(68, "7Z", "application/x-7z-compressed"),
    ZIP(69, "ZIP", "application/zip"),
    RAR(70, "RAR", "application/x-rar-compressed"),
    /**
     * Zip file
     */
    Z(71, "RTF", "application/x-compressed"),
    /**
     * Email message
     */
    EML(72, "EML", "message/rfc822"),
    EXE(73, "EXE", "application/octet-stream"),
    BIN(74, "BIN", "application/octet-stream"),
    DLL(75, "DLL", "application/octet-stream"),
    CONF(76, "CONF", "text/plain"),
    DAT(77, "DAT", "text/plain"),
    SQL(78, "SQL", "text/plain"),
    BAT(79, "BAT", "text/plain"),
    BSH(80, "BSH", "text/plain"),
    CMD(81, "CMD", "text/plain"),
    CSH(82, "CSH", "text/plain"),
    KSH(83, "KSH", "text/plain"),
    SH(84, "SH", "text/plain"),
    C(85, "C", "text/plain"),
    CC(86, "CC", "text/plain"),
    CPP(87, "CPP", "text/plain"),
    CPP_(88, "C++", "text/plain"),
    CXX(89, "CXX", "text/plain"),
    H(90, "H", "text/plain"),
    HH(91, "HH", "text/plain"),
    HPP(92, "HPP", "text/plain"),
    HPP_(93, "H++", "text/plain"),
    HXX(94, "HXX", "text/plain"),
    RPT(95, "RPT", "application/rpt"),
    CMS(96, "CMS", "text/plain; charset=UTF-8",true),
    CERT(97, "CERT", "text/plain; charset=UTF-8",true),
    MPG(98, "MPG", "application/x-msvideo");

    /**
     * .exe = svn:mime-type=application/octet-stream; svn:executable; .bin =
     * svn:mime-type=application/octet-stream; svn:executable; .dll =
     * svn:mime-type=application/octet-stream;
     */
    private final Integer id;
    private final Serializable adi;
    private final Serializable mimeType;
    private final Boolean text;
    private final Boolean sound;
    private final Boolean video;

    FileType(Integer id, Serializable adi, Serializable mimeType) {
        this.id = id;
        this.adi = adi;
        this.mimeType = mimeType;
        this.text = Boolean.FALSE;
        this.sound = Boolean.FALSE;
        this.video = Boolean.FALSE;
    }

    FileType(Integer id, Serializable adi, Serializable mimeType, Boolean text) {
        this.id = id;
        this.adi = adi;
        this.mimeType = mimeType;
        this.text = text;
        this.sound = Boolean.FALSE;
        this.video = Boolean.FALSE;

    }

    FileType(Integer id, Serializable adi, Serializable mimeType, Boolean text, Boolean sound, Boolean video) {
        this.id = id;
        this.adi = adi;
        this.mimeType = mimeType;
        this.text = text;
        this.sound = sound;
        this.video = video;
    }

    @Override
    public Serializable getAdi() {
        return adi;
    }

    public String getAdiTest() {
        return adi.toString();
    }

    @Override
    public Integer getId() {
        return id;
    }

    public Serializable getMimeType() {
        return mimeType;

    }

    public Boolean isText() {
        return text;
    }

    public Boolean isSound() {
        return sound;
    }

    public Boolean isVideo() {
        return video;
    }

}
