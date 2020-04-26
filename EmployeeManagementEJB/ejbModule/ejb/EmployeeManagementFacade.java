package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Areas;
import model.Employee;

/**
 * Session Bean implementation class EmployeeManagementFacade
 */
@Stateless
public class EmployeeManagementFacade implements EmployeeManagementFacadeLocal {

    @PersistenceContext(unitName = "EmpMgmtPU")
    private EntityManager entityManager;
	
	public EmployeeManagementFacade() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.persist(employee);		
	}

	@Override
	public Employee findEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		Query query = entityManager.createNamedQuery("Employee.findAll");
		List<Employee> empl = query.getResultList();
		return empl;
	}

	@Override
	public List<Areas> findAreas() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("SELECT a FROM Areas a");
		List<Areas> la  = query.getResultList();
		return la;
	}	
	
}
