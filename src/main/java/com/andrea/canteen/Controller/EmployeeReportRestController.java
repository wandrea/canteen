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


    @RequestMapping(value ="/canteen/employeereporttofile", method = RequestMethod.POST, produces = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=UTF-8")
    @CrossOrigin(origins = "http://localhost")
    public void employeeReportToFile(HttpServletResponse response){
        Workbook wb = employeeReportService.saveEmployeeReport();
        try {
            response.addHeader("Accept-Ranges", "bytes");
           // response.addHeader("Content-Length", String.valueOf(fileSize));
            response.addHeader("Cache-Control", "max-age=0");
            response.setDateHeader("Expires", 0);
            response.addHeader("Keep-Alive", "timeout=15, max=94");
            response.addHeader("Connection", "Keep-Alive");
            response.addHeader("Content-Type", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.addHeader("Content-Disposition", "attachment; filename=\"Dolgozók_riport.xlsx\"");
            wb.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
