package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.model.Books;
import com.javatpoint.model.Employee;
import com.javatpoint.repository.EmpRepo;

@Service
public class EmpService {

	@Autowired
	EmpRepo emprepo;
	
	public List<Employee> getempdatas() {
		
		Employee emp1=new Employee();
		List<Employee> emp=new ArrayList<Employee>();
		emprepo.findAll().forEach(emp2 -> emp.add(emp2));
		System.out.println("employeeeee"+emp);
		return emp;
	}


	public List<Employee> getempdata() 
	{
	List<Employee> books = new ArrayList<Employee>();
	emprepo.findAll().forEach(books1 -> books.add(books1));
	return books;
	}

}
