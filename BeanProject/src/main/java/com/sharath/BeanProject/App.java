package com.sharath.BeanProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import beans.Address;
import beans.Employee;
import springconfig.EmployeeConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext =  new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
    	Employee bean=(Employee)appContext.getBean(Employee.class);
    	System.out.println("Correct spelling? " + bean.checkName("Sharath"));
    	bean.getdeptName();
    	Address aBean=(Address)appContext.getBean(Address.class);
    	System.out.println(aBean.getAddress());
    	System.out.println(bean);

    	((AbstractApplicationContext) appContext).close();
    }
}
