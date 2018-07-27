package com.weidai.framework.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @描述
 * @author nic 
 * @time：2018年6月20日 上午11:17:16
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@Documented
public @interface MyRequestParam {
	String value() default "";
	
	boolean requied() default true;
}
