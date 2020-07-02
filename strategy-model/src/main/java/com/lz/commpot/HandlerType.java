package com.lz.commpot;

import java.lang.annotation.*;

/**
 * 〈处理类型〉
 *Chinese, English and Japanese
 * @author LZ
 * @date 2020/7/2
 * @since 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerType {

    String value();
}
