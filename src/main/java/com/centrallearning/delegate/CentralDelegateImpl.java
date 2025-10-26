package com.centrallearning.delegate;

import org.springframework.stereotype.Component;

import com.centrallearning.model.Employee;

@Component
public class CentralDelegateImpl implements CentralDelegate {
	@Override
	public String getName(String name) {
		return name;
	}

	@Override
	public String getEmployee(Employee employee) {
		return "Employee Details are - Name : "+employee.getName() + ", Age :"+ employee.getAge() + 
				"Department : "+ employee.getDepartment();
	}
}
