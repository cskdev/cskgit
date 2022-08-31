package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.model.Employee;

@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer> {

}
