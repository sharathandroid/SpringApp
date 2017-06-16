package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("Sharath")
	private String name;
	private String message;
	@Autowired
	@Qualifier("electronics")
private Department department;
	public String getMessage() {
		  return message;
		}

		public void setMessage(String message) {
		  this.message = message;
		}	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public boolean checkName(String name) {
		// TODO Auto-generated method stub
		if(name.equals(name))
		return true;
		return false;
	}
	
	public void getdeptName(){
	String deptName=department.getDepartmentName();
	System.out.println("Department Name is "+deptName);
	}
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method after properties are set : " + message);
	}

	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("Spring Container is destroy! Customer clean up");
	}
}
