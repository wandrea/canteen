package com.andrea.canteen.Service;


import com.andrea.canteen.Domain.EmployeeReport;
import com.andrea.canteen.Repository.EmployeeReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeReportService {
    @Autowired
    private EmployeeReportRepository employeeReportRepository;




    public List<EmployeeReport> employeeReport(){

        List<Object[]> employeeReportList= employeeReportRepository.employeeReport();


        List<EmployeeReport> employeeReportOutputList = new ArrayList<>();


        for(Object[] ob : employeeReportList){
            EmployeeReport employeeReport= new EmployeeReport();
            employeeReport.setSumPrice((BigInteger) ob[0]);
            employeeReport.setEmployeeName((String) ob[1]);

            employeeReportOutputList.add(employeeReport);
    }
    return employeeReportOutputList;
    }
}
