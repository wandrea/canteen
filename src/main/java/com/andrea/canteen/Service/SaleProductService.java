package com.andrea.canteen.Service;


import com.andrea.canteen.Domain.SaleProduct;
import com.andrea.canteen.Repository.SaleProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleProductService {

    @Autowired
    private SaleProductRepository saleProductRepository;

    public SaleProduct save(SaleProduct saleProduct) {
        return saleProductRepository.save(saleProduct);
    }

    public void deleteSaleProductById(int id) {
        saleProductRepository.delete(id);

    }



    public SaleProduct updateSaleProductById (int id, SaleProduct newSP){

        SaleProduct oldSP = saleProductRepository.findOne(id);

        oldSP.setProduct(newSP.getProduct());
        oldSP.setQuantity(newSP.getQuantity());
        return saleProductRepository.save(oldSP);
    }

}
