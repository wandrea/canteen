package com.andrea.canteen.Domain;

import javax.persistence.*;

@Entity
public class Product {


    @Id
    @SequenceGenerator(name="product_id_seq", sequenceName="product_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.AUTO, generator="product_id_seq")

    private Integer id;
    private String producName;
    private Integer productPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducName() {
        return producName;
    }

    public void setProducName(String producName) {
        this.producName = producName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }
}
