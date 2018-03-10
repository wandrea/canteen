package com.andrea.canteen.Service;


import com.andrea.canteen.Domain.Employee;
import com.andrea.canteen.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Iterable<Employee> findAllEmployee () {
        return employeeRepository.findAll();
    }
    public Employee findEmployeeById(int id) {
        return employeeRepository.findOne(id);

    }


}
