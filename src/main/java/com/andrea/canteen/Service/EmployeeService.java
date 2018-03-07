package com.andrea.canteen.Service;


import com.andrea.canteen.Domain.Employee;
import com.andrea.canteen.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Iterable<Employee> findAll () {
        return employeeRepository.findAll();
    }
    public Employee findById(int id) {
        return employeeRepository.findOne(id);

    }

}
