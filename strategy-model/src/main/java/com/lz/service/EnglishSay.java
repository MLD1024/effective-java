package com.lz.service;

import com.lz.commpot.HandlerType;
import org.springframework.stereotype.Service;

/**
 * 〈英语 〉
 *
 * @author LZ
 * @date 2020/7/2
 * @since 1.0.0
 */
@Service("sayHelloService-2")
public class EnglishSay implements SayHelloService {
    @Override
    public String say() {
        return "hello";
    }
}
