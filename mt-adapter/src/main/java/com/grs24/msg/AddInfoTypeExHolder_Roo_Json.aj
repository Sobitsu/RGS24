// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.grs24.msg;

import com.grs24.msg.AddInfoTypeExHolder;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect AddInfoTypeExHolder_Roo_Json {
    
    public String AddInfoTypeExHolder.toJson() {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(this);
    }
    
    public String AddInfoTypeExHolder.toJson(String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static AddInfoTypeExHolder AddInfoTypeExHolder.fromJsonToAddInfoTypeExHolder(String json) {
        return new JSONDeserializer<AddInfoTypeExHolder>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use(null, AddInfoTypeExHolder.class).deserialize(json);
    }
    
    public static String AddInfoTypeExHolder.toJsonArray(Collection<AddInfoTypeExHolder> collection) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String AddInfoTypeExHolder.toJsonArray(Collection<AddInfoTypeExHolder> collection, String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<AddInfoTypeExHolder> AddInfoTypeExHolder.fromJsonArrayToAddInfoTypeExHolders(String json) {
        return new JSONDeserializer<List<AddInfoTypeExHolder>>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use("values", AddInfoTypeExHolder.class).deserialize(json);
    }
    
}
