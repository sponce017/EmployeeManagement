package ejb;

import java.util.List;

import javax.ejb.Local;

import model.Areas;
import model.Employee;



@Local
public interface EmployeeManagementFacadeLocal {

	void saveEmployee(Employee employee);
	Employee findEmployee(Employee employee);
	List<Employee> findAll();		
	List<Areas> findAreas();
}