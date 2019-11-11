package com.nihui.springboot.response;

/**
 * @Classname ResponseData
 * @Description TODO
 * @Date 2019/11/11 4:32 PM
 * @Created by nihui
 */
public class ResponseData {
    private String message;
    private Integer code;
    private Object data;
    private Boolean status;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
