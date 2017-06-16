package beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ComputerScience implements Department {

	public String getDepartmentName() {
		// TODO Auto-generated method stub
		return "ComputerScience";
	}

}
