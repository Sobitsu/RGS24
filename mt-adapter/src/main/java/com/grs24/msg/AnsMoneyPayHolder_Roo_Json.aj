// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.grs24.msg;

import com.grs24.msg.AnsMoneyPayHolder;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect AnsMoneyPayHolder_Roo_Json {
    
    public String AnsMoneyPayHolder.toJson() {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(this);
    }
    
    public String AnsMoneyPayHolder.toJson(String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static AnsMoneyPayHolder AnsMoneyPayHolder.fromJsonToAnsMoneyPayHolder(String json) {
        return new JSONDeserializer<AnsMoneyPayHolder>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use(null, AnsMoneyPayHolder.class).deserialize(json);
    }
    
    public static String AnsMoneyPayHolder.toJsonArray(Collection<AnsMoneyPayHolder> collection) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String AnsMoneyPayHolder.toJsonArray(Collection<AnsMoneyPayHolder> collection, String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<AnsMoneyPayHolder> AnsMoneyPayHolder.fromJsonArrayToAnsMoneyPayHolders(String json) {
        return new JSONDeserializer<List<AnsMoneyPayHolder>>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use("values", AnsMoneyPayHolder.class).deserialize(json);
    }
    
}