package com.test.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

import com.test.BaseClass;

@ComponentScan(basePackageClasses=BaseClass.class)
@PropertySource("classpath:/bean.properties")
public class BeanConfigurer {

}
