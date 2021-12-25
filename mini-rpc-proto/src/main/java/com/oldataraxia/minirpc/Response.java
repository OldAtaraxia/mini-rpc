package com.oldataraxia.minirpc;

import lombok.Data;

/*
rpc的返回结果
* */
@Data
public class Response {
    private int code = 0;
    private String message = "ok";
    private Object data;
}
