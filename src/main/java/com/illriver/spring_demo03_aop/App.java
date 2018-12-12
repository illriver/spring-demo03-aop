package com.illriver.spring_demo03_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主体运行类
 *
 */
public class App 
{
    public static void main( String[] args ){
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
    	
    	DemoAnnotationService dAnnotationService = context.getBean(DemoAnnotationService.class);
    	
    	DemoMethodService dMethodService = context.getBean(DemoMethodService.class);
    	
    	dAnnotationService.add();
    	dMethodService.add();
    	
    	context.close();
    	
    }
}
