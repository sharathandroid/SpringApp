package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import beans.Employee;

@Configuration
@ComponentScan(basePackages = {"beans"} )
@Import(AddressConiguration.class)
public class EmployeeConfiguration {
//	@Bean(name="employee")
//	public Employee employee(){
//
//		return new Employee();
//
//	}
}
