package com.javatpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "emp_id")
	private int empl_id;

	@Column(name = "emp_name")
	private String emp_name;

	@Column(name = "emp_address")
	private String emp_address;

	private int emp_mobile;
	private String emp_dept;

	public int getEmpl_id() {
		return empl_id;
	}

	public void setEmpl_id(int empl_id) {
		this.empl_id = empl_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public int getEmp_mobile() {
		return emp_mobile;
	}

	public void setEmp_mobile(int emp_mobile) {
		this.emp_mobile = emp_mobile;
	}

	public String getEmp_dept() {
		return emp_dept;
	}

	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}

}
