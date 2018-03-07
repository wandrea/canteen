package com.andrea.canteen.Service;


import com.andrea.canteen.Domain.Sale;
import com.andrea.canteen.Repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {


    @Autowired
    private SaleRepository saleRepository;

    public Sale save(Sale sale) {
        return saleRepository.save(sale);
    }

    public void deleteSaleById(int id) {
        saleRepository.delete(id);

    }

}
