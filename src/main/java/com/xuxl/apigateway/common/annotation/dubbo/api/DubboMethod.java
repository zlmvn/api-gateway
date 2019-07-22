package com.xuxl.apigateway.common.annotation.dubbo.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author flyap
 * @email 927840351@qq.com
 * @date 2018/10/25
 * @used
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DubboMethod {
    int retries() default 0;
    int timeOut() default 0;
}
