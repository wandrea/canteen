package com.andrea.canteen.Controller;


import com.andrea.canteen.Domain.Employee;
import com.andrea.canteen.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/canteen/employee/all", method = RequestMethod.GET )
    @CrossOrigin(origins = "http://localhost")
    public Iterable<Employee> findAll(){

        return  employeeService.findAllEmployee();
    }


    @RequestMapping(value = "/canteen/employee/{id}", method =RequestMethod.GET )
    @CrossOrigin(origins = "http://localhost")
    public Employee findById(@PathVariable("id") int id){

        return  employeeService.findEmployeeById(id);
    }
}
