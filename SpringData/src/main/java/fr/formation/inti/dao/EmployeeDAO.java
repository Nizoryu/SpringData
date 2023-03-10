package fr.formation.inti.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.formation.inti.entity.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {
	List<Employee> findByLastName(String lastName);

}
