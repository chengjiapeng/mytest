package com.example.bean;

/**
 * Created by chengjiapeng on 2017/3/14.
 */
public class WiselyResponse {
    private String responseMessage;

    public WiselyResponse() {
    }

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
