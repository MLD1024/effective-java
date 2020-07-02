package com.lz.commpot;

import com.lz.service.SayHelloService;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈处理上下文〉
 * double check
 *
 * @author LZ
 * @date 2020/7/2
 * @since 1.0.0
 */
public class HandlerContext {

    private Map<String, SayHelloService> data = null;
    private static final String SERVICE_NAME = "sayHelloService";

    public HandlerContext(Map<String, SayHelloService> data) {
        this.data = data;
    }

    public String say(String type) {
        String name = String.join("-",SERVICE_NAME, type);
        return data.get(name).say();
    }

}
