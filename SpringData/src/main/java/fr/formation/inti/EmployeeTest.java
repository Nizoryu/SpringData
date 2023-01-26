package fr.formation.inti;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.formation.inti.service.EmployeeService;

public class EmployeeTest {
	 public static void main(String[] args) {
	        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
	        appContext.scan("fr.formation.inti.*");
	        appContext.refresh();
	 
	        EmployeeService empserv = (EmployeeService) appContext.getBean("employeeService");
	        empserv.test();
	 
	        appContext.close();
	    }
}
