package com.andrea.canteen.Controller;


import com.andrea.canteen.Domain.EmployeeReport;
import com.andrea.canteen.Service.EmployeeReportService;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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


    @RequestMapping(value ="/canteen/employeereporttofile", method = RequestMethod.POST, produces = "application/octet-stream;charset=UTF-8")
    @CrossOrigin(origins = "http://localhost")
    public void employeeReportToFile(HttpServletResponse response){
        Workbook wb = employeeReportService.saveEmployeeReport();
        try {

            response.addHeader("Content-Disposition", "attachment; filename=\"Dolgozók_riport.xlsx\"");
            wb.write(response.getOutputStream());
            wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
