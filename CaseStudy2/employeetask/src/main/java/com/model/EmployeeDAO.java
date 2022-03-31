package com.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository

public interface  EmployeeDAO extends CrudRepository<Employee,Integer>{

}
