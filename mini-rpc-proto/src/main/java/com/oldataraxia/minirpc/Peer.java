package com.oldataraxia.minirpc;

import lombok.AllArgsConstructor;
import lombok.Data;

// 表示网络传输的断点
@Data
@AllArgsConstructor
public class Peer {
    private final String host;
    private final int port;
}
