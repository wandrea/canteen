package com.andrea.canteen.Service;


import com.andrea.canteen.Domain.ProductReport;
import com.andrea.canteen.Repository.ProductReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductReportService {


    @Autowired
    private ProductReportRepository productReportRepository;

    public List<ProductReport> productReport(){

        List<Object[]> productReportList= productReportRepository.productReport();


        List<ProductReport> productReportOutputList = new ArrayList<>();


        for(Object[] ob : productReportList){
            ProductReport productReport= new ProductReport();
            productReport.setSumQuantity ((BigInteger) ob[0]);
            productReport.setProductName((String) ob[1]);

            productReportOutputList.add(productReport);
        }
        return productReportOutputList;
    }
}
