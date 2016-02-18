// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.grs24.msg;

import com.grs24.msg.SubjLimitTypeHolder;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect SubjLimitTypeHolder_Roo_Json {
    
    public String SubjLimitTypeHolder.toJson() {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(this);
    }
    
    public String SubjLimitTypeHolder.toJson(String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static SubjLimitTypeHolder SubjLimitTypeHolder.fromJsonToSubjLimitTypeHolder(String json) {
        return new JSONDeserializer<SubjLimitTypeHolder>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use(null, SubjLimitTypeHolder.class).deserialize(json);
    }
    
    public static String SubjLimitTypeHolder.toJsonArray(Collection<SubjLimitTypeHolder> collection) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String SubjLimitTypeHolder.toJsonArray(Collection<SubjLimitTypeHolder> collection, String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<SubjLimitTypeHolder> SubjLimitTypeHolder.fromJsonArrayToSubjLimitTypeHolders(String json) {
        return new JSONDeserializer<List<SubjLimitTypeHolder>>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use("values", SubjLimitTypeHolder.class).deserialize(json);
    }
    
}
