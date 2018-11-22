package com.example.demo.model;

/**
 * @author shijy
 * @Date 2018/11/21 11 : 26
 * @Descriprion
 */
public class JsonResult {
    private String status;
    private Object result;

    public JsonResult() {
    }

    public JsonResult(String status, Object result) {
        this.status = status;
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
