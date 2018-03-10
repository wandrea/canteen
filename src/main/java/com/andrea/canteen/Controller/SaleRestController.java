package com.andrea.canteen.Controller;

import com.andrea.canteen.Domain.Sale;
import com.andrea.canteen.Domain.SaleProduct;
import com.andrea.canteen.Service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaleRestController {
    @Autowired
    private SaleService saleService;



    @RequestMapping (value="/canteen/sale", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost")
    public Sale createSale (@RequestBody Sale sale) {
        for (SaleProduct sp : sale.getSaleProducts()) {
            sp.setSale(sale);
        }
        return saleService.save(sale);
    }

    @RequestMapping(value = "/canteen/sale/{id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost")
    public void deleteSaleById (@PathVariable("id") int id){
        saleService.deleteSaleById(id);
    }
}
