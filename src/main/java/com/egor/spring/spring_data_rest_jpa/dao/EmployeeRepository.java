package com.egor.spring.spring_data_rest_jpa.dao;






import com.egor.spring.spring_data_rest_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{
  

}
