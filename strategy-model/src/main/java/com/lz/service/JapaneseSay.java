package com.lz.service;

import com.lz.commpot.HandlerType;
import org.springframework.stereotype.Service;

/**
 * 〈日语〉
 *
 * @author LZ
 * @date 2020/7/2
 * @since 1.0.0
 */
@Service("sayHelloService-3")
public class JapaneseSay implements SayHelloService {
    @Override
    public String say() {
        return "こんにちは";
    }
}
