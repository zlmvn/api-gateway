package com.xuxl.apigateway.common.annotation.http.api;

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
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiParam {
    String name() default "";
    String defaultValue() default "";
    boolean required() default false;
    String desc() default "";

}
