package com.illriver.spring_demo03_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 * @author Pactera
 *
 */
@Configuration
@ComponentScan("com.illriver.spring_demo03_aop")
@EnableAspectJAutoProxy
public class AopConfig {
	
}
