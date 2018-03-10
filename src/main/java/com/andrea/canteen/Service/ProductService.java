package com.andrea.canteen.Service;

import com.andrea.canteen.Domain.Product;
import com.andrea.canteen.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> findAllProduct () {
        return productRepository.findAll();
    }
    public Product findProductById(int id) {
        return productRepository.findOne(id);

    }



}
