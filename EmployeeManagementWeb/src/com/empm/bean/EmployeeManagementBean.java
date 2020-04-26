package com.empm.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import model.Areas;
import model.Employee;
import ejb.EmployeeManagementFacadeLocal;

public class EmployeeManagementBean {

	@EJB
	private EmployeeManagementFacadeLocal emfl;
	private List<Employee> lse; 
	private Employee emp;
	private List<Areas> lsa;
	
	public EmployeeManagementBean(){
		
	}
	
	@PostConstruct
	public void init(){
		this.emp = new Employee();
		this.lse = this.emfl.findAll();
		this.lsa = this.emfl.findAreas();
	}
	
	public List<Areas> getLsa() {
		return lsa;
	}

	public void setLsa(List<Areas> lsa) {
		this.lsa = lsa;
	}
	
	public String save(){
		emfl.saveEmployee(emp);
		init();
		return "index";
	}
	
	public EmployeeManagementFacadeLocal getEmfl() {
		return emfl;
	}
	
	public void setEmfl(EmployeeManagementFacadeLocal emfl) {
		this.emfl = emfl;
	}
	
	public List<Employee> getLse() {
		return lse;
	}
	
	public void setLse(List<Employee> lse) {
		this.lse = lse;
	}
	
	public Employee getEmp() {
		return emp;
	}
	
	public void setEmp(Employee emp) {
		this.emp = emp;
	}	
}
