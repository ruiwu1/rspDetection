package com.iursp.conf.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 日志注解
 * @author ruiwu
 * @version 1.0
 * @date 2018年6月6日
 */
@Target(ElementType.METHOD)  
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggerManage {

	public String description();
}