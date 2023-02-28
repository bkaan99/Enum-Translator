/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.fonet.core.common.enums;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import tr.com.fonet.core.common.application.core.CoreExceptions;
import tr.com.fonet.core.common.enums.base.DbEnum;
import tr.com.fonet.core.common.enums.base.KayitEnum;
import tr.com.fonet.core.common.localization.LocaleInfo;
import tr.com.fonet.core.common.query.QueryParamMapper;
import tr.com.fonet.core.common.socket.CoreWebSocket;
import tr.com.fonet.core.common.socket.NoUserSocketConnectionException;
import tr.com.fonet.core.common.user.UserHelper;
import tr.com.fonet.core.common.utils.ListUtils;
import tr.com.fonet.core.common.utils.NumberUtils;
import tr.com.fonet.core.common.utils.ObjectUtils;
import tr.com.fonet.core.common.utils.ReflectionUtils;
import tr.com.fonet.core.common.utils.StringUtils;
import tr.com.fonet.core.common.utils.XMLUtils;

/**
 *
 * @author muysal
 */
public class DbEnumUtils {

    private static String enumClass = "enumClass";

    /**
     * Id değeri ve enum class ı verilen DbEnum'un enum karşılığını döner. Enum
     * karşılığı bulunamadığında, null değeri döner.
     *
     * @param <T>
     * @param enumClass
     * @param id
     * @return
     */
    public static <T extends DbEnum> T getDbEnum(Class<T> enumClass, Serializable id) {
        if(id == null){
            return null;
        }
        return getDbEnum(enumClass, id, null);
    }

    /**
     * Id değeri ve enum class ı verilen DbEnum'un enum karşılığını döner. Enum
     * karşılığı bulunamadığında, defaultValue ile gönderilen değer döner.
     *
     * @param <T>
     * @param enumClass
     * @param id
     * @param defaultValue
     * @return
     */
    public static <T extends DbEnum> T getDbEnum(Class<T> enumClass, Serializable id, T defaultValue) {
        if (id == null) {
            return defaultValue;
        }
        for (DbEnum item : enumClass.getEnumConstants()) {
            if (NumberUtils.equals(id, item.getId())) {
                return (T) item;
            }
        }
        return defaultValue;
    }

    /**
     * Id değeri ve enum class ı verilen DbEnum'un enum karşılığını döner.
     * showExcepiton parametresi true gönderilirse, enum karşılığı
     * bulunamadığında hata döner.
     *
     * @param <T>
     * @param enumClass
     * @param id
     * @param showException
     * @return
     */
    public static <T extends DbEnum> T getDbEnum(Class<T> enumClass, Serializable id, boolean showException) {
        if (id == null) {
            throw CoreExceptions.kayitBulunamadi("Enum değeri belirtilmemiş.").ex();
        }
        for (DbEnum item : enumClass.getEnumConstants()) {
            if (NumberUtils.equals(id, item.getId())) {
                return (T) item;
            }
        }
        throw CoreExceptions.kayitBulunamadi("Enum karşılığı bulunamadı. (enum: " + enumClass.getSimpleName() + ",id:" + id.toString()).ex();
    }

    /**
     * adi değeri ve enum class ı verilen DbEnum'un enum karşılığını döner.<br>
     * karşılığı bulunamadığında, null değeri döner.
     *
     * @param <T>
     * @param enumClass
     * @param adi
     * @return
     */
    public static <T extends DbEnum> T getDbEnumByAdi(Class<T> enumClass, Serializable adi) {
        return getDbEnumByAdi(enumClass, adi, null);
    }

    /**
     * adi değeri ve enum class ı verilen DbEnum'un enum karşılığını döner.<br>
     * Enum karşılığı bulunamadığında, defaultValue ile gönderilen değer döner.
     *
     * @param <T>
     * @param enumClass
     * @param adi
     * @param defaultValue
     * @return
     */
    public static <T extends DbEnum> T getDbEnumByAdi(Class<T> enumClass, Serializable adi, T defaultValue) {
        for (DbEnum item : enumClass.getEnumConstants()) {
            if (ObjectUtils.equals(item.getAdi(), adi)) {
                return (T) item;
            }
        }
        return defaultValue;
    }

    public static JSONObject getDbEnumJsonStr(DbEnum val) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", val.getId());
        jSONObject.put("adi", val.getAdi());
        return jSONObject;
    }

    public static <T> T getDbEnumObjectFromJson(Class<T> enumClass, JSONObject jSONObject) {

        return getDbEnumNotNull(enumClass, jSONObject.getInt("id"), null);
    }

    public static <T> T getDbEnumNotNull(Class<T> enumClass, Serializable id, T defaultValue) {
        if (DbEnum.class.isAssignableFrom(enumClass)) {
            if (id == null) {
                return defaultValue;
            }
            for (T item : enumClass.getEnumConstants()) {
                if (defaultValue == null) {
                    defaultValue = (T) item;
                }
                if (NumberUtils.equals(id, ((DbEnum) item).getId())) {
                    return (T) item;
                }
            }
        }
        return defaultValue;
    }

    public static <T extends DbEnum, V extends Serializable> List<T> getDbEnumList(Class<T> enumClass, List<V> idValueList) {
        List<T> list = new ArrayList<>();
        for (V value : idValueList) {
            T dbEnum = getDbEnum(enumClass, value);
            if (dbEnum != null) {
                list.add(dbEnum);
            }
        }
        return list;
    }

    public static <T extends DbEnum> List<T> getDbEnumList(Class<T> enumClass, String idArray) {
        return getDbEnumList(enumClass, idArray, ",");
    }

    public static <T extends DbEnum> List<T> getDbEnumList(Class<T> enumClass, String idArray, String separator) {
        List<T> list = new ArrayList<>();
        idArray = StringUtils.defaultIfBlank(idArray, "");
        String[] split = StringUtils.split(idArray, separator);
        for (String str : split) {
            T dbEnum = getDbEnum(enumClass, str);
            if (dbEnum != null) {
                list.add(dbEnum);
            }
        }

        return list;
    }

    public static <T extends DbEnum> String getDbEnumListAsJsonStr(QueryParamMapper map, Class<T> enumClass, String jsonRoot) {
        List<T> dbEnumList = getDbEnumList(enumClass);
        // dbEnumList = ListQueryHelper.getList(dbEnumList, map);
        if (StringUtils.isEmpty(jsonRoot)) {
            return getDbEnumListAsJsonStr(dbEnumList);
        }
        return new JSONObject().put(jsonRoot, new JSONArray(getDbEnumListAsJsonStr(dbEnumList))).toString();
    }

    public static <T extends DbEnum> String getDbEnumListAsJsonStr(Class<T> enumClass, String jsonRoot) {
        List<T> dbEnumList = getDbEnumList(enumClass);
        if (StringUtils.isEmpty(jsonRoot)) {
            return getDbEnumListAsJsonStr(dbEnumList);
        }
        return new JSONObject().put(jsonRoot, new JSONArray(getDbEnumListAsJsonStr(dbEnumList))).toString();
    }

    public static String getDbEnumPackageListAsJsonStr(String packageRoot, String jsonRoot) {
        try {
            List<Class<DbEnum>> classes = ReflectionUtils.getPackageClassList(packageRoot, DbEnum.class, true);
            ArrayList<String> packagenames = new ArrayList<>();

            for (int i = 0; i < classes.size(); i++) {
                Class<?> enumClass = (Class<?>) classes.get(i);
                packagenames.add(enumClass.getName());
            }
            if (StringUtils.isEmpty(jsonRoot)) {
                return (new JSONArray(packagenames)).toString();
            } else {
                return (new JSONObject().put(jsonRoot, new JSONArray(packagenames))).toString();
            }
        } catch (Exception e) {
            throw CoreExceptions.genelHata("Belirlenen Package Bulunamadı ({0})").setMessageArgs(packageRoot).ex();
        }
    }

    public static <T extends DbEnum> String getDbEnumListAsJsonStr(List<T> dbEnumList) {
        JSONArray jsonArray = new JSONArray();
        for (DbEnum item : dbEnumList) {
            jsonArray.put(enumToJson(item));
        }
        return jsonArray.toString();

//        JSONObject json = new JSONObject().put("data", enumClass.getEnumConstants());
//        return json.toString();
//        return new String(json.toString().getBytes("UTF-8"), "UTF-8");
    }

//    public static <T extends DbEnum> Map<Serializable, Serializable> getDbEnumList(Class<T> enumClass) {
//        Map<Serializable, Serializable> list = new LinkedHashMap();
//        for (DbEnum item : enumClass.getEnumConstants()) {
//            list.put(item.getId(), item.getAdi());
//        }
//        return list;
//    }
    public static <T extends DbEnum> List<T> getDbEnumList(Class<T> enumClass) {
        List<T> list = new ArrayList<>();
        try {
            if (enumClass != null && enumClass.getEnumConstants() != null && enumClass.getEnumConstants().length > 0) {
                for (DbEnum item : enumClass.getEnumConstants()) {
                    list.add((T) item);
                }
            }

        } catch (Exception e) {

        }
        return list;
    }

    public static <T extends DbEnum> List<Serializable> getDbEnumValueList(Class<T> enumClass) {
        List<Serializable> valuelist = new ArrayList<Serializable>();
        for (DbEnum item : enumClass.getEnumConstants()) {
            valuelist.add(item.getAdi());
        }
        return valuelist;
    }

    public static <T extends DbEnum> List<Serializable> getDbEnumKeyList(Class<T> enumClass) {
        List<Serializable> valuelist = new ArrayList<Serializable>();
        for (DbEnum item : enumClass.getEnumConstants()) {
            valuelist.add(item.getId());
        }
        return valuelist;
    }

    public static Element getXmlFromDbEnum(XMLUtils utils, String fieldName, DbEnum val) {

        ObjectUtils.checkNull(fieldName, "fieldName");
        Element createElement = utils.createElement(fieldName);
        createElement.appendChild(utils.createTextNode(val.getId().toString()));
        return createElement;
    }

    public static Element getXmlWithClassFromDbEnum(XMLUtils utils, DbEnum val) {
        Element createElement = utils.createElement("dbenum");
        createElement.setAttribute(enumClass, val.getClass().getCanonicalName());
        createElement.appendChild(utils.createElement("id", val.getId().toString()));
        createElement.appendChild(utils.createElement("adi", val.getAdi().toString()));
        return createElement;
    }

    public static Element getXmlFromDbEnum(XMLUtils utils, DbEnum val) {
        Element createElement = utils.createElement("dbenum");
        createElement.appendChild(utils.createTextNode(val.getId().toString()));
        return createElement;
    }

    public static <T> T getDbEnumObjectFromXml(Class<T> enumClass, Element xmlElement) throws ClassNotFoundException {
        if (XMLUtils.isTextElement(xmlElement)) {
            String id = XMLUtils.getTextElement(xmlElement);
            NumberUtils.isDigits(id);
            return getDbEnumNotNull(enumClass, id, null);
        } else {
            return (T) getDbEnumFromXmlWtihClass(xmlElement);
        }
    }

    public static <T extends DbEnum> T getDbEnumFromXml(Class<T> enumClass, Element xmlElement) {
        if (XMLUtils.isTextElement(xmlElement)) {
            String id = XMLUtils.getTextElement(xmlElement);
            NumberUtils.isDigits(id);
            return getDbEnumNotNull(enumClass, id, null);
        }
        return null;
    }

    public static DbEnum getDbEnumFromXmlWtihClass(Element xmlElement) throws ClassNotFoundException {
        String attribute = xmlElement.getAttribute(enumClass);
        if (StringUtils.isNotBlank(attribute)) {
            Class<?> forName = Class.forName(attribute);
            NodeList elementsByTagName = xmlElement.getElementsByTagName("id");
            if (elementsByTagName.getLength() == 1) {
                Node item = elementsByTagName.item(0);
                String id = XMLUtils.getTextElement(item);
                return (DbEnum) getDbEnumNotNull(forName, id, null);
            }
        }
        return null;
    }

    public static <T extends DbEnum> Integer getIdIntValue(T dbEnum) {
        if (dbEnum == null) {
            return null;
        }
        return NumberUtils.createInteger(dbEnum.getId());
    }

    public static Serializable convertToDatabaseColumn(DbEnum attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getId();
    }

    public static <T extends KayitEnum> String getKayitEnumListAsJsonStr(QueryParamMapper map, Class<T> enumClass, String jsonRoot) {
        List<T> kayitEnumList = getKayitEnumList(enumClass);
        //  kayitEnumList = ListQueryHelper.getList(kayitEnumList, map);
        if (StringUtils.isEmpty(jsonRoot)) {
            return getKayitEnumListAsJsonStr(kayitEnumList);
        }
        return new JSONObject().put(jsonRoot, new JSONArray(getKayitEnumListAsJsonStr(kayitEnumList))).toString();
    }

    public static <T extends KayitEnum> String getKayitEnumListAsJsonStr(Class<T> enumClass, String jsonRoot) {
        List<T> kayitEnumList = getKayitEnumList(enumClass);
        if (StringUtils.isEmpty(jsonRoot)) {
            return getKayitEnumListAsJsonStr(kayitEnumList);
        }
        return new JSONObject().put(jsonRoot, new JSONArray(getKayitEnumListAsJsonStr(kayitEnumList))).toString();
    }

    public static <T extends KayitEnum> String getKayitEnumListAsJsonStr(List<T> kayitEnumList) {
        JSONArray jsonArray = new JSONArray();

        for (KayitEnum item : kayitEnumList) {
            if (item.getDurum() == Durum.AKTIF) {
                jsonArray.put(enumToJson(item));
            }
        }
        return jsonArray.toString();

//        JSONObject json = new JSONObject().put("data", enumClass.getEnumConstants());
//        return json.toString();
//        return new String(json.toString().getBytes("UTF-8"), "UTF-8");
    }

    public static <T extends KayitEnum> List<T> getKayitEnumList(Class<T> enumClass) {
        List<T> list = new ArrayList<>();
        for (DbEnum item : enumClass.getEnumConstants()) {
            list.add((T) item);
        }
        return list;
    }

    public static String getEnumListAsJsonStr(String className, QueryParamMapper map) throws ClassNotFoundException {
        try {
            Class cls = Class.forName(className);
            if (KayitEnum.class.isAssignableFrom(cls)) {
                return DbEnumUtils.getKayitEnumListAsJsonStr(map, cls, "data");
            } else {
                return DbEnumUtils.getDbEnumListAsJsonStr(map, cls, "data");
            }
        } catch (ClassNotFoundException ex) {
            try {
                if (!"undefined".equals(className)) {
                    CoreWebSocket.sendTextMessage("Enum Class'ı bulunamadı: (" + className + ")", 5);
                }
            } catch (NoUserSocketConnectionException ex2) {
            }
            throw ex;
        }
    }

//    public static List<KadinSagligiIslemleri> getDbEnumList(Class<KadinSagligiIslemleri> aClass, String kadinSagligiIslemleri) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    private static JSONObject enumToJson(DbEnum item) {
        if (item == null) {
            return null;
        }
        /*if(UserHelper.getUserSession() != null && UserHelper.getUserSession().isLogin() && UserHelper.getUserSession().getLocaleInfo().isTrTr()) {
            JSONObject json2 = new JSONObject(item);
            Object[] keySet = json2.keySet().toArray();
            for (Object key : keySet) {
                if (key.toString().startsWith("ı")) {
                    String newKey = key.toString().replace("ı", "i");
                    String value = json2.get(key.toString()).toString();
                    json2.remove(key.toString());
                    json2.put(newKey, value);
                }
                return json2;
            }
            return null;
        }*/


        List<Method> allMethods = ReflectionUtils.getAllMethods(item.getClass());
        JSONObject jSONObject = new JSONObject();
        Object value = null;
        String key = null;
        String methodName;
        try {
            for (Method allMethod : allMethods) {
                methodName = allMethod.getName();
                key = null;
                if (methodName.startsWith("get")) {
                   if ("getClass".equals(methodName)
                           || "getDeclaringClass".equals(methodName)) {
                       continue;
                   }
                   key = methodName.substring(3, methodName.length());
               } else if (methodName.startsWith("is")) {
                   if ("getClass".equals(methodName)
                           || "getDeclaringClass".equals(methodName)) {
                       continue;
                   }
                   key = methodName.substring(2, methodName.length());
               }
               if (StringUtils.isNotBlank(key)) {
                   key = StringUtils.lowerCase(key.substring(0, 1), Locale.ENGLISH) + key.substring(1, key.length());
                   if (DbEnum.class.isAssignableFrom(allMethod.getReturnType())) {
                       if (item.getClass().getCanonicalName().equals(allMethod.getReturnType().getCanonicalName())) {
                           continue;
                       }
                       value = enumToJson((DbEnum) allMethod.invoke(item));
                   } else {
                       value = allMethod.invoke(item);
                       if (methodName.equals("getAdi") && (value != null && String.class.isAssignableFrom(value.getClass()))) {
                           if(UserHelper.getUserSession() != null && UserHelper.getUserSession().isLogin() && UserHelper.getUserSession().getLocaleInfo().isTrTr()) {
                               LocaleInfo localeInfo = new LocaleInfo();
                               Locale loc = Locale.forLanguageTag("en-US");
                               localeInfo.setLocale(loc);
                               value = UserHelper.getUserResources().getString(value.toString(), localeInfo);
                           } else {
                               value = UserHelper.getUserResources().getString(value.toString());
                           }
                       }
                   }
                   jSONObject.put(key, value);
               }

           }
            return  jSONObject;
       } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NullPointerException ex) {
           throw new RuntimeException(ex);
       }
    }

    public static <T extends DbEnum> List<T> getDbEnumListFromMultiValue(Class<T> enumClass, String value, String splitChar) {
        List<T> list = new ArrayList<>();

        if (StringUtils.isBlank(value)) {
            return list;
        }

//        value = StringUtils.removeStart(value, splitChar);
//        value = StringUtils.removeEnd(value, splitChar);
        String[] valueList = StringUtils.split(value, splitChar);
        for (String v : valueList) {
            if (StringUtils.isBlank(v)) {
                continue;
            }
            T e = getDbEnum(enumClass, v);
            if (e != null) {
                list.add(e);
            }
        }

        return list;
    }

    public static <T extends DbEnum> String getMultiValueFromDbEnumList(List<T> enumList, String splitChar) {
        if (ListUtils.isEmptyList(enumList)) {
            return null;
        }
        String value = splitChar;
        for (T e : enumList) {
            value += e.getId() + splitChar;
        }

        return value;
    }

}
