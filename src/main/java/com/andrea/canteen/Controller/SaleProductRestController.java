package com.andrea.canteen.Controller;


import com.andrea.canteen.Domain.SaleProduct;
import com.andrea.canteen.Service.SaleProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaleProductRestController {
    @Autowired
    private SaleProductService saleProductService;

    @RequestMapping(value="/canteen/saleproduct", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost")
    public SaleProduct createSale (@RequestBody SaleProduct saleProduct) {

        return saleProductService.save(saleProduct);
    }

    @RequestMapping(value = "/canteen/saleproduct/{id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost")
    public void deleteSaleProductById (@PathVariable("id") int id){
        saleProductService.deleteSaleProductById(id);
    }

    @RequestMapping(value = "/canteen/saleproduct/all", method = RequestMethod.GET )
    @CrossOrigin(origins = "http://localhost")
    public Iterable<SaleProduct> findAll(){

        return  saleProductService.findAllSaleProduct();
    }


    @RequestMapping (value = "/canteen/saleproduct/{id}", method= RequestMethod.PUT)
    @CrossOrigin(origins = "http://localhost")
    public SaleProduct updateSaleProductById(@PathVariable ("id") int id, @RequestBody SaleProduct saleProduct){
        return saleProductService.updateSaleProductById(id, saleProduct);
    }
}
