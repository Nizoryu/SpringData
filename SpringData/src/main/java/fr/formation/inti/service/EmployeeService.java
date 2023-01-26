package fr.formation.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.EmployeeDAO;
import fr.formation.inti.entity.Employee;

@Service("employeeService")
public class EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	public void test() {
		// Save a new Employee
        Employee emp = new Employee();
        emp.setFirstName("John");
        emp.setLastName("Smith");
         
        dao.save(emp);
         
        // Find a Employee by ID
        Optional<Employee> result = dao.findById(1);
        result.ifPresent(Employee -> System.out.println(Employee));
         
        // Find Employees by last name
        List<Employee> Employees = dao.findByLastName("Smith");
        Employees.forEach(Employee -> System.out.println(Employee));
         
        // List all Employees
        Iterable<Employee> iterator = dao.findAll();
        iterator.forEach(Employee -> System.out.println(Employee));
         
        // Count number of Employee
        long count = dao.count();
        System.out.println("Number of Employees: " + count);
		
	}
}
