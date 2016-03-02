// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.grs24.msg;

import com.grs24.msg.AnsMoneySearchHolder;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect AnsMoneySearchHolder_Roo_Json {
    
    public String AnsMoneySearchHolder.toJson() {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(this);
    }
    
    public String AnsMoneySearchHolder.toJson(String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static AnsMoneySearchHolder AnsMoneySearchHolder.fromJsonToAnsMoneySearchHolder(String json) {
        return new JSONDeserializer<AnsMoneySearchHolder>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use(null, AnsMoneySearchHolder.class).deserialize(json);
    }
    
    public static String AnsMoneySearchHolder.toJsonArray(Collection<AnsMoneySearchHolder> collection) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String AnsMoneySearchHolder.toJsonArray(Collection<AnsMoneySearchHolder> collection, String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<AnsMoneySearchHolder> AnsMoneySearchHolder.fromJsonArrayToAnsMoneySearchHolders(String json) {
        return new JSONDeserializer<List<AnsMoneySearchHolder>>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use("values", AnsMoneySearchHolder.class).deserialize(json);
    }
    
}