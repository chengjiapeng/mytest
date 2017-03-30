package com.example.restful_consume.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.*;

/**
 * Created by chengjiapeng on 2017/3/21.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;

    private Value value;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{"+
                "type='"+type+'\''+
                ",value="+value+
                "}";
    }
}
