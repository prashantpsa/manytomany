package com.manytomany.dto;

public class ErrorDto {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ErrorDto(String msg) {
        this.msg = msg;
    }
}
