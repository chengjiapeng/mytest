package com.example.restful_consume.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by chengjiapeng on 2017/3/21.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private long id;

    private String quote;

    public Value() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{"+
                "id="+id+
                ",quote="+quote+'\''+
                '}';
    }
}
