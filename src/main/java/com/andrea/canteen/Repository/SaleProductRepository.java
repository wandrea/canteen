package com.andrea.canteen.Repository;

import com.andrea.canteen.Domain.SaleProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SaleProductRepository extends CrudRepository<SaleProduct, Integer> {
}
