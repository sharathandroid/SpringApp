package beans;

import org.springframework.stereotype.Component;

@Component
public class Electronics implements Department {

	public String getDepartmentName() {
		// TODO Auto-generated method stub
		return "Electronics";
	}

}
