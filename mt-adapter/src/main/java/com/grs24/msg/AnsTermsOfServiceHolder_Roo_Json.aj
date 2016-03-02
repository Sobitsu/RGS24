// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.grs24.msg;

import com.grs24.msg.AnsTermsOfServiceHolder;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect AnsTermsOfServiceHolder_Roo_Json {
    
    public String AnsTermsOfServiceHolder.toJson() {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(this);
    }
    
    public String AnsTermsOfServiceHolder.toJson(String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static AnsTermsOfServiceHolder AnsTermsOfServiceHolder.fromJsonToAnsTermsOfServiceHolder(String json) {
        return new JSONDeserializer<AnsTermsOfServiceHolder>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use(null, AnsTermsOfServiceHolder.class).deserialize(json);
    }
    
    public static String AnsTermsOfServiceHolder.toJsonArray(Collection<AnsTermsOfServiceHolder> collection) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String AnsTermsOfServiceHolder.toJsonArray(Collection<AnsTermsOfServiceHolder> collection, String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<AnsTermsOfServiceHolder> AnsTermsOfServiceHolder.fromJsonArrayToAnsTermsOfServiceHolders(String json) {
        return new JSONDeserializer<List<AnsTermsOfServiceHolder>>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use("values", AnsTermsOfServiceHolder.class).deserialize(json);
    }
    
}