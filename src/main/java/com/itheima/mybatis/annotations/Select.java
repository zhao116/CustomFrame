package com.itheima.mybatis.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 查询注解
 */
//更改注解生命周期
@Retention(RetentionPolicy.RUNTIME)
//出现的位置在哪
@Target(ElementType.METHOD)
public @interface Select {

    /**
     * 配置sql语句的
     * @return
     */
    String value();
}
