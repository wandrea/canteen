package com.andrea.canteen.Controller;

import com.andrea.canteen.Domain.ProductReport;
import com.andrea.canteen.Service.ProductReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductReportRestController {

    @Autowired
    private ProductReportService productReportService;


    @RequestMapping(value = "/canteen/productreport", method = RequestMethod.POST )
    @CrossOrigin(origins = "http://localhost")
    public List<ProductReport> productReport(){
        return productReportService.productReport();
    }
}
