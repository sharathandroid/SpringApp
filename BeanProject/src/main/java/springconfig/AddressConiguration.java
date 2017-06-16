package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Address;
import beans.Employee;
@Configuration
public class AddressConiguration {
	@Bean(name="address")
	public Address address(){

		return new Address();

	}
}
