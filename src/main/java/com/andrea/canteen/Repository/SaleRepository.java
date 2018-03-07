package com.andrea.canteen.Repository;

import com.andrea.canteen.Domain.Sale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends CrudRepository<Sale, Integer> {
}
