package com.infobasic.restapitemplate.controller.rest.util;

import com.google.gson.JsonElement;

public class StandardResponse {
    private String status;
    private JsonElement data;

    public StandardResponse(String statusresponse, JsonElement data) {
        this.status = statusresponse;
        this.data = data;
    }

    public StandardResponse(String statusresponse) {
        this.status = statusresponse;
    }

    public String getStatusResponse() {
        return status;
    }

    public void setStatusResponse(String statusresponse) {
        this.status = statusresponse;
    }

    public JsonElement getData() {
        return data;
    }

    public void setData(JsonElement data) {
        this.data = data;
    }

}
