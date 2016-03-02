// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.grs24.msg;

import com.grs24.msg.ReqPayCalcHolder;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect ReqPayCalcHolder_Roo_Json {
    
    public String ReqPayCalcHolder.toJson() {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(this);
    }
    
    public String ReqPayCalcHolder.toJson(String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static ReqPayCalcHolder ReqPayCalcHolder.fromJsonToReqPayCalcHolder(String json) {
        return new JSONDeserializer<ReqPayCalcHolder>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use(null, ReqPayCalcHolder.class).deserialize(json);
    }
    
    public static String ReqPayCalcHolder.toJsonArray(Collection<ReqPayCalcHolder> collection) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String ReqPayCalcHolder.toJsonArray(Collection<ReqPayCalcHolder> collection, String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<ReqPayCalcHolder> ReqPayCalcHolder.fromJsonArrayToReqPayCalcHolders(String json) {
        return new JSONDeserializer<List<ReqPayCalcHolder>>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use("values", ReqPayCalcHolder.class).deserialize(json);
    }
    
}