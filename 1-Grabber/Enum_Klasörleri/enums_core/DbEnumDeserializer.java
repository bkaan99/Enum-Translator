/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.fonet.core.common.enums;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import org.json.JSONArray;
import org.json.JSONObject;
import tr.com.fonet.core.common.application.core.CoreExceptions;
import tr.com.fonet.core.common.enums.base.DbEnum;
import tr.com.fonet.core.common.utils.ConverterUtils;

/**
 *
 * @author muysal
 */
//public class DbEnumDeserializer extends JsonDeserializer<DbEnum> {
public class DbEnumDeserializer extends JsonDeserializer<DbEnum> implements ContextualDeserializer {

//    public DbEnumDeserializer(Class<?> targetClass) {
//        this.enumClass = (Class<? extends DbEnum>) targetClass;
//    }
    private Class<? extends DbEnum> enumClass;

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException {
        JavaType type = property.getType();
        if(!type.isEnumType()){
             if(property.getType().isCollectionLikeType()){
                 type = property.getType().getContentType();
             }
        }
        enumClass = (Class<? extends DbEnum>) type.getRawClass();
        return this;
    }

    @Override
    public DbEnum deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        Serializable id;
        // Enum değeri json object ise
        if (jp.getText().equals("{")) {
            String jsonStr = ConverterUtils.getStringFromStringReader((StringReader) jp.getInputSource());
            String enumField = jp.getParsingContext().getParent().getCurrentName();
            if (enumField == null) {
                enumField = jp.getParsingContext().getParent().getParent().getCurrentName();
            }
            JSONObject json = new JSONObject(jsonStr);
            Object jsonValue = json.get(enumField);
            if (jsonValue instanceof JSONArray) {                
                throw CoreExceptions.genelHata("In Enum arrays, send only the ID's as a list.").ex();
            }
            id = (Serializable) ((JSONObject) jsonValue).get("id");
        } else {
            id = (Serializable) jp.getText();
        }
        return DbEnumUtils.getDbEnum(enumClass, id);

    }

}
