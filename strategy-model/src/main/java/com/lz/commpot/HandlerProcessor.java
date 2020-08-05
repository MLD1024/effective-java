package com.lz.commpot;

import com.lz.service.SayHelloService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 〈处理 handlerType 注解〉
 *
 * @author LZ
 * @date 2020/7/2
 * @since 1.0.0
 */
@Component
public class HandlerProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Map<String, SayHelloService> beansOfType = beanFactory.getBeansOfType(SayHelloService.class);
        HandlerContext handlerContext = new HandlerContext(beansOfType);
        beanFactory.registerSingleton("handlerContext",handlerContext);
    }
}
