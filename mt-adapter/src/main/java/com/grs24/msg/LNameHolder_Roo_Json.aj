// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.grs24.msg;

import com.grs24.msg.LNameHolder;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect LNameHolder_Roo_Json {
    
    public String LNameHolder.toJson() {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(this);
    }
    
    public String LNameHolder.toJson(String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static LNameHolder LNameHolder.fromJsonToLNameHolder(String json) {
        return new JSONDeserializer<LNameHolder>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use(null, LNameHolder.class).deserialize(json);
    }
    
    public static String LNameHolder.toJsonArray(Collection<LNameHolder> collection) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String LNameHolder.toJsonArray(Collection<LNameHolder> collection, String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<LNameHolder> LNameHolder.fromJsonArrayToLNameHolders(String json) {
        return new JSONDeserializer<List<LNameHolder>>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use("values", LNameHolder.class).deserialize(json);
    }
    
}
