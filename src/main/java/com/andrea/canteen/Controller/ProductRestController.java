package com.andrea.canteen.Controller;

import com.andrea.canteen.Domain.Product;
import com.andrea.canteen.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/canteen/product/all", method = RequestMethod.GET )
    @CrossOrigin(origins = "http://localhost")
    public Iterable<Product> findAll(){

        return  productService.findAllProduct();
    }



}
