package com.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

import com.test.BaseClass;
import com.test.bean.Address;
import com.test.bean.Employee;

@ComponentScan(basePackageClasses=BaseClass.class)
@PropertySource("classpath:/bean.properties")
@EnableAspectJAutoProxy
public class BeanConfigurer {
	/*@Bean
	public Employee getEmployee(Address address)
	{
		Employee employee = new Employee("Imtiyaz", null);
		return employee;
	}
	
	@Bean 
	public Address getAddress()
	{
		return new Address();
	}*/
}
