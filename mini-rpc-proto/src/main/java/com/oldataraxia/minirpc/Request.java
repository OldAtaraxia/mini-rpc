package com.oldataraxia.minirpc;

import lombok.Data;


/*
* 表示rpc的一次请求
* */
@Data
public class Request {
    private ServiceDescriptor service;
    private Object[] parameters;
}
