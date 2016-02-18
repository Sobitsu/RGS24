// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.grs24.msg;

import com.grs24.msg.X509IssueSubjectHolder;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect X509IssueSubjectHolder_Roo_Json {
    
    public String X509IssueSubjectHolder.toJson() {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(this);
    }
    
    public String X509IssueSubjectHolder.toJson(String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static X509IssueSubjectHolder X509IssueSubjectHolder.fromJsonToX509IssueSubjectHolder(String json) {
        return new JSONDeserializer<X509IssueSubjectHolder>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use(null, X509IssueSubjectHolder.class).deserialize(json);
    }
    
    public static String X509IssueSubjectHolder.toJsonArray(Collection<X509IssueSubjectHolder> collection) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String X509IssueSubjectHolder.toJsonArray(Collection<X509IssueSubjectHolder> collection, String[] fields) {
        return new JSONSerializer()
        .transform(new flexjson.transformer.DateTransformer("yyyy-MM-dd"), java.util.Date.class)
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<X509IssueSubjectHolder> X509IssueSubjectHolder.fromJsonArrayToX509IssueSubjectHolders(String json) {
        return new JSONDeserializer<List<X509IssueSubjectHolder>>()
        .use(java.util.Date.class, new flexjson.transformer.DateTransformer("yyyy-MM-dd"))
        .use("values", X509IssueSubjectHolder.class).deserialize(json);
    }
    
}
