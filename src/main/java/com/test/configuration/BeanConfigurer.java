package com.test.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.test.bean.Employee;

@ComponentScan(basePackageClasses=Employee.class)
@PropertySource("classpath:/bean.properties")
public class BeanConfigurer {

}
