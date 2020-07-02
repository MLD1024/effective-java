package com.lz.service;

import com.lz.commpot.HandlerType;
import org.springframework.stereotype.Service;

/**
 * 〈中文〉
 *
 * @author LZ
 * @date 2020/7/2
 * @since 1.0.0
 */
@Service("sayHelloService-1")
public class ChineseSay implements SayHelloService {
    @Override
    public String say() {
        return "你好";
    }
}
