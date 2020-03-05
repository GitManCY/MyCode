package com.itmayiedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 事务注解 设置传播行为
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExtTransaction {

}
