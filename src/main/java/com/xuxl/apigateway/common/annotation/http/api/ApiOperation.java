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
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ApiOperation {
    String value() default "";
    String desc() default "";
    String owner() default "";
    String method() default "";


}
