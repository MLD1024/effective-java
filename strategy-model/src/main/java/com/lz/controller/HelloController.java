package com.lz.controller;

import com.lz.commpot.HandlerContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;

/**
 * 〈say  hello 〉
 *
 * @author LZ
 * @date 2020/7/2
 * @since 1.0.0
 */
@RestController
@SuppressWarnings("all")
public class HelloController {

    @Autowired
    private HandlerContext handlerContext;

    @GetMapping("/hello")
    public String say(@RequestParam String type) {
        return handlerContext.say(type);
    }
}
