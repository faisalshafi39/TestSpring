package com.test.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;
import com.test.bean.Employee;
import com.test.configuration.BeanConfigurer;

public class ConfigMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigurer.class);
		context.registerShutdownHook();
		
		Employee employee = (Employee)context.getBean(Employee.class);
		
		if(employee != null)
		{
			System.out.println("Gotcha bean");
			System.out.println("------------------------------");
			System.out.println(employee.getName() + "\n" + 
					employee.getAddress().getState() + "\n" + 
					employee.getAddress().getCity());
			
			/*ExpressionParser parser = new SpelExpressionParser();
			Expression expression = parser.parseExpression("addressBean.getState()");
			String result =  (String)expression.getValue();
			
			System.out.println( " <<<<<<<<<<<<<<< " + result + " >>>>>>>>>");*/
		}
	}

}
