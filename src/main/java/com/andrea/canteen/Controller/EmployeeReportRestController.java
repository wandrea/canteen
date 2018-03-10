package com.andrea.canteen.Controller;


import com.andrea.canteen.Domain.EmployeeReport;
import com.andrea.canteen.Service.EmployeeReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeReportRestController {
    @Autowired
    private EmployeeReportService employeeReportService;


    @RequestMapping(value = "/canteen/employeereport", method = RequestMethod.POST )
    @CrossOrigin(origins = "http://localhost")
    public List<EmployeeReport>employeeReport(){
        return employeeReportService.employeeReport();
    }
}
